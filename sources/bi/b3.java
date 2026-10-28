package bi;

import android.text.SpannableString;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.dy;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.rw;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.sz;
import org.telegram.ui.bu0;
import org.telegram.ui.ey;
import org.telegram.ui.re;
import org.telegram.ui.se;
import org.telegram.ui.wg;
import org.telegram.ui.wn;
import org.telegram.ui.xx;
public final class b3 implements Utilities.Callback {
    public final int f4331a;
    public final Object f4332b;
    public final Object f4333c;
    public final Object d;
    public final Object e;
    public final Object f4334f;

    public b3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f4331a = i10;
        this.f4332b = obj;
        this.f4333c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f4334f = obj5;
    }

    @Override
    public final void run(Object obj) {
        final TLRPC.UserFull userFull;
        switch (this.f4331a) {
            case 0:
                h7.Z0((h7) this.f4332b, (TL_stars.StarGift) this.f4333c, (TL_stars.StarGiftAttribute) this.d, (org.telegram.ui.Components.yc[]) this.e, (boolean[]) this.f4334f, (ArrayList) obj);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new c3((org.telegram.ui.wb) this.f4332b, (TLRPC.ChannelParticipant) obj, (ArrayList) this.f4333c, (ArrayList) this.d, (ArrayList) this.e, (org.telegram.ui.ua) this.f4334f, 12));
                return;
            case 2:
                final wn wnVar = (wn) this.f4332b;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f4333c;
                String str = (String) this.d;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f4334f;
                final TLRPC.User user = (TLRPC.User) obj;
                if (user != null) {
                    userFull = wnVar.getMessagesController().getUserFull(user.f22177id);
                } else {
                    userFull = null;
                }
                l80 I = l80.I(wnVar, s1Var);
                in0 in0Var = new in0(wnVar.getParentActivity(), wnVar.f45309ua);
                I.f30163p = new re(in0Var, 1);
                org.telegram.ui.y yVar = new org.telegram.ui.y(wnVar, user, str, 3);
                l80 J = I.J();
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new bu0(I, 26), false);
                J.k();
                J.c(R.drawable.msg_addbot, LocaleController.getString(R.string.CreateNewContact), new org.telegram.ui.q1(wnVar, I, str), false);
                J.c(R.drawable.menu_contact_existing, LocaleController.getString(R.string.AddToExistingContact), new bu0(yVar, 27), false);
                if (tL_contact == null && (user == null || !wnVar.getContactsController().contactsDict.containsKey(Long.valueOf(user.f22177id)))) {
                    I.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), new hi.o2(I, J, 4), false);
                    I.k();
                }
                if (user == null) {
                    I.c(R.drawable.menu_invit_telegram, LocaleController.getString(R.string.InviteToTelegramShort), new se(wnVar, str, 10), false);
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new se(wnVar, str, 11), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new se(wnVar, str, 12), false);
                    I.k();
                    I.p(13, -1, LocaleController.getString(R.string.NumberNotOnTelegram));
                } else {
                    I.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new wg(wnVar, user, 0), false);
                    if (!UserObject.isUserSelf(user)) {
                        I.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoiceCallViaTelegram), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (r4) {
                                    case 0:
                                        wn wnVar2 = wnVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            wnVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                boolean z12 = z10;
                                                org.telegram.ui.Components.voip.g2.m(user, false, z12, wnVar2.getParentActivity(), userFull2, wnVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        boolean z122 = z10;
                                        org.telegram.ui.Components.voip.g2.m(user, false, z122, wnVar2.getParentActivity(), userFull2, wnVar2.getAccountInstance());
                                        return;
                                    default:
                                        wn wnVar3 = wnVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            wnVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                boolean z13 = z11;
                                                org.telegram.ui.Components.voip.g2.m(user, true, z13, wnVar3.getParentActivity(), userFull3, wnVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        boolean z132 = z11;
                                        org.telegram.ui.Components.voip.g2.m(user, true, z132, wnVar3.getParentActivity(), userFull3, wnVar3.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                        I.c(R.drawable.msg_videocall, LocaleController.getString(R.string.VideoCallViaTelegram), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (r4) {
                                    case 0:
                                        wn wnVar2 = wnVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            wnVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                boolean z122 = z10;
                                                org.telegram.ui.Components.voip.g2.m(user, false, z122, wnVar2.getParentActivity(), userFull2, wnVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        boolean z1222 = z10;
                                        org.telegram.ui.Components.voip.g2.m(user, false, z1222, wnVar2.getParentActivity(), userFull2, wnVar2.getAccountInstance());
                                        return;
                                    default:
                                        wn wnVar3 = wnVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            wnVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                boolean z132 = z11;
                                                org.telegram.ui.Components.voip.g2.m(user, true, z132, wnVar3.getParentActivity(), userFull3, wnVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        boolean z1322 = z11;
                                        org.telegram.ui.Components.voip.g2.m(user, true, z1322, wnVar3.getParentActivity(), userFull3, wnVar3.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new se(wnVar, str, 8), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new se(wnVar, str, 9), false);
                    I.k();
                    I.n(user, LocaleController.getString(R.string.ViewProfile), new org.telegram.ui.q1(wnVar, in0Var, user, 18));
                }
                in0Var.e(I);
                if (characterStyle instanceof a71) {
                    String url = ((a71) characterStyle).getURL();
                    if (url == null) {
                        url = "";
                    }
                    String trim = url.trim();
                    if (trim.startsWith("tel:")) {
                        trim = trim.substring(4);
                    }
                    if (trim.length() > 204) {
                        trim = trim.substring(0, 204) + "…";
                    }
                    SpannableString spannableString = new SpannableString(trim);
                    spannableString.setSpan(characterStyle, 0, spannableString.length(), 33);
                    in0Var.f(s1Var, characterStyle, spannableString, false);
                } else {
                    in0Var.f(s1Var, characterStyle, null, false);
                }
                wnVar.showDialog(in0Var);
                return;
            case 3:
                wn wnVar2 = (wn) this.f4332b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.f4333c;
                String str2 = (String) this.d;
                MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f4334f;
                Long l4 = (Long) obj;
                int i10 = wnVar2.f45091d4;
                Object obj2 = this.e;
                if (i10 == 1) {
                    org.telegram.ui.Components.g5.L(wnVar2.getParentActivity(), wnVar2.f45168j6, new a1.d(wnVar2, tL_document, str2, obj2, 6), wnVar2.f45309ua);
                } else {
                    wnVar2.getSendMessagesHelper().sendSticker(tL_document, str2, wnVar2.f45168j6, wnVar2.D5, wnVar2.f45166j4, null, wnVar2.B5, sendAnimationData, true, 0, 0, false, obj2, wnVar2.O8(), l4.longValue(), wnVar2.a9(), wnVar2.f45330w5);
                    tL_document = tL_document;
                }
                wnVar2.r9(false);
                wnVar2.Y.k(tL_document);
                wnVar2.Y.setFieldText("");
                return;
            case 4:
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.f4334f;
                Runnable runnable = (Runnable) obj;
                sy syVar = ((ry) this.f4332b).f32398a;
                String str3 = syVar.v;
                ArrayList arrayList4 = syVar.f32698r;
                ArrayList arrayList5 = syVar.h;
                ArrayList arrayList6 = syVar.f32699s;
                sz szVar = syVar.F;
                if (((String) this.f4333c).equals(str3)) {
                    rw rwVar = szVar.V;
                    dy dyVar = szVar.P;
                    int i11 = 0;
                    rwVar.e(false);
                    syVar.f32702y = true;
                    s4.h0 adapter = dyVar.getAdapter();
                    sy syVar2 = szVar.S;
                    if (adapter != syVar2) {
                        dyVar.setAdapter(syVar2);
                    }
                    arrayList5.clear();
                    arrayList5.addAll(syVar.f32697n);
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                    arrayList6.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj3 = arrayList2.get(i12);
                        i12++;
                        jy jyVar = (jy) obj3;
                        if (longSparseIntArray.indexOfKey(jyVar.f29781c.f22055id) < 0) {
                            longSparseIntArray.append(jyVar.f29781c.f22055id, 1);
                            arrayList6.add(jyVar);
                        }
                    }
                    int size2 = arrayList3.size();
                    while (i11 < size2) {
                        Object obj4 = arrayList3.get(i11);
                        i11++;
                        jy jyVar2 = (jy) obj4;
                        if (longSparseIntArray.indexOfKey(jyVar2.f29781c.f22055id) < 0) {
                            longSparseIntArray.append(jyVar2.f29781c.f22055id, 1);
                            arrayList6.add(jyVar2);
                        }
                    }
                    syVar.l();
                    return;
                }
                return;
            default:
                ey eyVar = (ey) this.f4332b;
                Long l10 = (Long) this.d;
                Runnable runnable2 = (Runnable) obj;
                eyVar.getClass();
                ((org.telegram.ui.ActionBar.e2) this.f4333c).dismiss();
                eyVar.getMessagesController().loadChannelParticipants(l10);
                xx xxVar = eyVar.C2;
                eyVar.removeSelfFromStack();
                ((org.telegram.ui.nd) this.e).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.r2) this.f4334f).finishFragment();
                if (xxVar != null) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(MessagesStorage.TopicKey.of(-l10.longValue(), 0L));
                    xxVar.v(eyVar, arrayList7, null, false, eyVar.J2, eyVar.K2, eyVar.L2, null);
                    return;
                }
                return;
        }
    }
}
