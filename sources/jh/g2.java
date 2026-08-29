package jh;

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
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.cw;
import org.telegram.ui.Components.dx;
import org.telegram.ui.Components.dy;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.wx;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.fg;
import org.telegram.ui.fy;
import org.telegram.ui.hd;
import org.telegram.ui.ie;
import org.telegram.ui.it0;
import org.telegram.ui.je;
import org.telegram.ui.ob;
import org.telegram.ui.tn;
import org.telegram.ui.yx;
public final class g2 implements Utilities.Callback {
    public final int f12091a;
    public final Object f12092b;
    public final Object f12093c;
    public final Object d;
    public final Object f12094e;
    public final Object f12095f;

    public g2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f12091a = i10;
        this.f12092b = obj;
        this.f12093c = obj2;
        this.d = obj3;
        this.f12094e = obj4;
        this.f12095f = obj5;
    }

    @Override
    public final void run(Object obj) {
        final TLRPC.UserFull userFull;
        switch (this.f12091a) {
            case 0:
                h5.r0((h5) this.f12092b, (TL_stars.StarGift) this.f12093c, (TL_stars.StarGiftAttribute) this.d, (vc[]) this.f12094e, (boolean[]) this.f12095f, (ArrayList) obj);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ih.f1((ob) this.f12092b, (TLRPC.ChannelParticipant) obj, (ArrayList) this.f12093c, (ArrayList) this.d, (ArrayList) this.f12094e, (org.telegram.ui.na) this.f12095f, 11));
                return;
            case 2:
                final tn tnVar = (tn) this.f12092b;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f12093c;
                String str = (String) this.d;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.f12094e;
                CharacterStyle characterStyle = (CharacterStyle) this.f12095f;
                final TLRPC.User user = (TLRPC.User) obj;
                if (user != null) {
                    userFull = tnVar.getMessagesController().getUserFull(user.f22539id);
                } else {
                    userFull = null;
                }
                j70 I = j70.I(tnVar, s1Var);
                yl0 yl0Var = new yl0(tnVar.getParentActivity(), tnVar.f42746aa);
                I.f29595p = new ie(yl0Var, 1);
                org.telegram.ui.b0 b0Var = new org.telegram.ui.b0(tnVar, user, str, 2);
                j70 J = I.J();
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new it0(I, 25), false);
                J.k();
                J.c(R.drawable.msg_addbot, LocaleController.getString(R.string.CreateNewContact), new org.telegram.ui.u1(tnVar, I, str), false);
                J.c(R.drawable.menu_contact_existing, LocaleController.getString(R.string.AddToExistingContact), new it0(b0Var, 26), false);
                if (tL_contact == null && (user == null || !tnVar.getContactsController().contactsDict.containsKey(Long.valueOf(user.f22539id)))) {
                    I.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), new ih.z2(I, J, 2), false);
                    I.k();
                }
                if (user == null) {
                    I.c(R.drawable.menu_invit_telegram, LocaleController.getString(R.string.InviteToTelegramShort), new je(tnVar, str, 8), false);
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new je(tnVar, str, 9), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new je(tnVar, str, 10), false);
                    I.k();
                    I.p(13, -1, LocaleController.getString(R.string.NumberNotOnTelegram));
                } else {
                    I.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new fg(tnVar, user, 0), false);
                    if (!UserObject.isUserSelf(user)) {
                        I.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoiceCallViaTelegram), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (r4) {
                                    case 0:
                                        tn tnVar2 = tnVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            tnVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.h2.n(user, false, z10, tnVar2.getParentActivity(), userFull2, tnVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.h2.n(user, false, z10, tnVar2.getParentActivity(), userFull2, tnVar2.getAccountInstance());
                                        return;
                                    default:
                                        tn tnVar3 = tnVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            tnVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                org.telegram.ui.Components.voip.h2.n(user, true, z11, tnVar3.getParentActivity(), userFull3, tnVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        org.telegram.ui.Components.voip.h2.n(user, true, z11, tnVar3.getParentActivity(), userFull3, tnVar3.getAccountInstance());
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
                                        tn tnVar2 = tnVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            tnVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.h2.n(user, false, z10, tnVar2.getParentActivity(), userFull2, tnVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.h2.n(user, false, z10, tnVar2.getParentActivity(), userFull2, tnVar2.getAccountInstance());
                                        return;
                                    default:
                                        tn tnVar3 = tnVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            tnVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                org.telegram.ui.Components.voip.h2.n(user, true, z11, tnVar3.getParentActivity(), userFull3, tnVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        org.telegram.ui.Components.voip.h2.n(user, true, z11, tnVar3.getParentActivity(), userFull3, tnVar3.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new je(tnVar, str, 6), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new je(tnVar, str, 7), false);
                    I.k();
                    I.n(user, LocaleController.getString(R.string.ViewProfile), new org.telegram.ui.u1(tnVar, yl0Var, user, 16));
                }
                yl0Var.e(I);
                if (characterStyle instanceof c51) {
                    String url = ((c51) characterStyle).getURL();
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
                    yl0Var.f(s1Var, characterStyle, spannableString, false);
                } else {
                    yl0Var.f(s1Var, characterStyle, null, false);
                }
                tnVar.showDialog(yl0Var);
                return;
            case 3:
                tn tnVar2 = (tn) this.f12092b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.f12093c;
                String str2 = (String) this.d;
                MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f12095f;
                Long l10 = (Long) obj;
                int i10 = tnVar2.N3;
                Object obj2 = this.f12094e;
                if (i10 == 1) {
                    org.telegram.ui.Components.c5.M(tnVar2.getParentActivity(), tnVar2.P5, new a1.d(tnVar2, tL_document, str2, obj2, 5), tnVar2.f42746aa);
                } else {
                    tnVar2.getSendMessagesHelper().sendSticker(tL_document, str2, tnVar2.P5, tnVar2.f42856j5, tnVar2.T3, null, tnVar2.f42831h5, sendAnimationData, true, 0, 0, false, obj2, tnVar2.C8(), l10.longValue(), tnVar2.N8(), tnVar2.f42768c5);
                    tL_document = tL_document;
                }
                tnVar2.e9(false);
                tnVar2.U.o(tL_document);
                tnVar2.U.setFieldText("");
                return;
            case 4:
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.f12094e;
                ArrayList arrayList3 = (ArrayList) this.f12095f;
                Runnable runnable = (Runnable) obj;
                ey eyVar = ((dy) this.f12092b).f27885a;
                String str3 = eyVar.v;
                ArrayList arrayList4 = eyVar.f28199r;
                ArrayList arrayList5 = eyVar.h;
                ArrayList arrayList6 = eyVar.f28200s;
                fz fzVar = eyVar.B;
                if (((String) this.f12093c).equals(str3)) {
                    cw cwVar = fzVar.R;
                    dx dxVar = fzVar.L;
                    int i11 = 0;
                    cwVar.e(false);
                    eyVar.f28203y = true;
                    f2.p0 adapter = dxVar.getAdapter();
                    ey eyVar2 = fzVar.O;
                    if (adapter != eyVar2) {
                        dxVar.setAdapter(eyVar2);
                    }
                    arrayList5.clear();
                    arrayList5.addAll(eyVar.f28198n);
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                    arrayList6.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj3 = arrayList2.get(i12);
                        i12++;
                        wx wxVar = (wx) obj3;
                        if (longSparseIntArray.indexOfKey(wxVar.f34505c.f22419id) < 0) {
                            longSparseIntArray.append(wxVar.f34505c.f22419id, 1);
                            arrayList6.add(wxVar);
                        }
                    }
                    int size2 = arrayList3.size();
                    while (i11 < size2) {
                        Object obj4 = arrayList3.get(i11);
                        i11++;
                        wx wxVar2 = (wx) obj4;
                        if (longSparseIntArray.indexOfKey(wxVar2.f34505c.f22419id) < 0) {
                            longSparseIntArray.append(wxVar2.f34505c.f22419id, 1);
                            arrayList6.add(wxVar2);
                        }
                    }
                    eyVar.l();
                    return;
                }
                return;
            default:
                fy fyVar = (fy) this.f12092b;
                Long l11 = (Long) this.d;
                Runnable runnable2 = (Runnable) obj;
                fyVar.getClass();
                ((org.telegram.ui.ActionBar.c2) this.f12093c).dismiss();
                fyVar.getMessagesController().loadChannelParticipants(l11);
                yx yxVar = fyVar.f38379y2;
                fyVar.removeSelfFromStack();
                ((hd) this.f12094e).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.o2) this.f12095f).finishFragment();
                if (yxVar != null) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(MessagesStorage.TopicKey.of(-l11.longValue(), 0L));
                    yxVar.v(fyVar, arrayList7, null, false, fyVar.F2, fyVar.G2, fyVar.H2, null);
                    return;
                }
                return;
        }
    }
}
