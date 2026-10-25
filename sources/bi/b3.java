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
import org.telegram.ui.Components.dy;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.rw;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.z61;
import org.telegram.ui.cy;
import org.telegram.ui.gg;
import org.telegram.ui.re;
import org.telegram.ui.se;
import org.telegram.ui.un;
import org.telegram.ui.ux;
import org.telegram.ui.zt0;
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
                final un unVar = (un) this.f4332b;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f4333c;
                String str = (String) this.d;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f4334f;
                final TLRPC.User user = (TLRPC.User) obj;
                if (user != null) {
                    userFull = unVar.getMessagesController().getUserFull(user.f22174id);
                } else {
                    userFull = null;
                }
                k80 I = k80.I(unVar, s1Var);
                hn0 hn0Var = new hn0(unVar.getParentActivity(), unVar.f44385qa);
                I.f29861p = new re(hn0Var, 1);
                org.telegram.ui.y yVar = new org.telegram.ui.y(unVar, user, str, 2);
                k80 J = I.J();
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new zt0(I, 26), false);
                J.k();
                J.c(R.drawable.msg_addbot, LocaleController.getString(R.string.CreateNewContact), new org.telegram.ui.q1(unVar, I, str), false);
                J.c(R.drawable.menu_contact_existing, LocaleController.getString(R.string.AddToExistingContact), new zt0(yVar, 27), false);
                if (tL_contact == null && (user == null || !unVar.getContactsController().contactsDict.containsKey(Long.valueOf(user.f22174id)))) {
                    I.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), new hi.o2(I, J, 4), false);
                    I.k();
                }
                if (user == null) {
                    I.c(R.drawable.menu_invit_telegram, LocaleController.getString(R.string.InviteToTelegramShort), new se(unVar, str, 8), false);
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new se(unVar, str, 9), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new se(unVar, str, 10), false);
                    I.k();
                    I.p(13, -1, LocaleController.getString(R.string.NumberNotOnTelegram));
                } else {
                    I.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new gg(unVar, user, 0), false);
                    if (!UserObject.isUserSelf(user)) {
                        I.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoiceCallViaTelegram), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (r4) {
                                    case 0:
                                        un unVar2 = unVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            unVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                boolean z12 = z10;
                                                org.telegram.ui.Components.voip.g2.m(user, false, z12, unVar2.getParentActivity(), userFull2, unVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        boolean z122 = z10;
                                        org.telegram.ui.Components.voip.g2.m(user, false, z122, unVar2.getParentActivity(), userFull2, unVar2.getAccountInstance());
                                        return;
                                    default:
                                        un unVar3 = unVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            unVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                boolean z13 = z11;
                                                org.telegram.ui.Components.voip.g2.m(user, true, z13, unVar3.getParentActivity(), userFull3, unVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        boolean z132 = z11;
                                        org.telegram.ui.Components.voip.g2.m(user, true, z132, unVar3.getParentActivity(), userFull3, unVar3.getAccountInstance());
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
                                        un unVar2 = unVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            unVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                boolean z122 = z10;
                                                org.telegram.ui.Components.voip.g2.m(user, false, z122, unVar2.getParentActivity(), userFull2, unVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        boolean z1222 = z10;
                                        org.telegram.ui.Components.voip.g2.m(user, false, z1222, unVar2.getParentActivity(), userFull2, unVar2.getAccountInstance());
                                        return;
                                    default:
                                        un unVar3 = unVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            unVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                boolean z132 = z11;
                                                org.telegram.ui.Components.voip.g2.m(user, true, z132, unVar3.getParentActivity(), userFull3, unVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        boolean z1322 = z11;
                                        org.telegram.ui.Components.voip.g2.m(user, true, z1322, unVar3.getParentActivity(), userFull3, unVar3.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new se(unVar, str, 6), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new se(unVar, str, 7), false);
                    I.k();
                    I.n(user, LocaleController.getString(R.string.ViewProfile), new org.telegram.ui.q1(unVar, hn0Var, user, 16));
                }
                hn0Var.e(I);
                if (characterStyle instanceof z61) {
                    String url = ((z61) characterStyle).getURL();
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
                    hn0Var.f(s1Var, characterStyle, spannableString, false);
                } else {
                    hn0Var.f(s1Var, characterStyle, null, false);
                }
                unVar.showDialog(hn0Var);
                return;
            case 3:
                un unVar2 = (un) this.f4332b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.f4333c;
                String str2 = (String) this.d;
                MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f4334f;
                Long l4 = (Long) obj;
                int i10 = unVar2.f44221d4;
                Object obj2 = this.e;
                if (i10 == 1) {
                    org.telegram.ui.Components.g5.L(unVar2.getParentActivity(), unVar2.f44249f6, new a1.d(unVar2, tL_document, str2, obj2, 6), unVar2.f44385qa);
                } else {
                    unVar2.getSendMessagesHelper().sendSticker(tL_document, str2, unVar2.f44249f6, unVar2.f44498z5, unVar2.f44295j4, null, unVar2.f44473x5, sendAnimationData, true, 0, 0, false, obj2, unVar2.L8(), l4.longValue(), unVar2.X8(), unVar2.f44407s5);
                    tL_document = tL_document;
                }
                unVar2.o9(false);
                unVar2.Y.l(tL_document);
                unVar2.Y.setFieldText("");
                return;
            case 4:
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.f4334f;
                Runnable runnable = (Runnable) obj;
                sy syVar = ((ry) this.f4332b).f32344a;
                String str3 = syVar.v;
                ArrayList arrayList4 = syVar.f32702r;
                ArrayList arrayList5 = syVar.h;
                ArrayList arrayList6 = syVar.f32703s;
                sz szVar = syVar.F;
                if (((String) this.f4333c).equals(str3)) {
                    rw rwVar = szVar.V;
                    dy dyVar = szVar.P;
                    int i11 = 0;
                    rwVar.e(false);
                    syVar.f32706y = true;
                    s4.h0 adapter = dyVar.getAdapter();
                    sy syVar2 = szVar.S;
                    if (adapter != syVar2) {
                        dyVar.setAdapter(syVar2);
                    }
                    arrayList5.clear();
                    arrayList5.addAll(syVar.f32701n);
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
                        if (longSparseIntArray.indexOfKey(jyVar.f29733c.f22054id) < 0) {
                            longSparseIntArray.append(jyVar.f29733c.f22054id, 1);
                            arrayList6.add(jyVar);
                        }
                    }
                    int size2 = arrayList3.size();
                    while (i11 < size2) {
                        Object obj4 = arrayList3.get(i11);
                        i11++;
                        jy jyVar2 = (jy) obj4;
                        if (longSparseIntArray.indexOfKey(jyVar2.f29733c.f22054id) < 0) {
                            longSparseIntArray.append(jyVar2.f29733c.f22054id, 1);
                            arrayList6.add(jyVar2);
                        }
                    }
                    syVar.l();
                    return;
                }
                return;
            default:
                cy cyVar = (cy) this.f4332b;
                Long l10 = (Long) this.d;
                Runnable runnable2 = (Runnable) obj;
                cyVar.getClass();
                ((org.telegram.ui.ActionBar.e2) this.f4333c).dismiss();
                cyVar.getMessagesController().loadChannelParticipants(l10);
                ux uxVar = cyVar.C2;
                cyVar.removeSelfFromStack();
                ((org.telegram.ui.nd) this.e).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.r2) this.f4334f).finishFragment();
                if (uxVar != null) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(MessagesStorage.TopicKey.of(-l10.longValue(), 0L));
                    uxVar.v(cyVar, arrayList7, null, false, cyVar.J2, cyVar.K2, cyVar.L2, null);
                    return;
                }
                return;
        }
    }
}
