package mh;

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
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.iw;
import org.telegram.ui.Components.kx;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.sc;
import org.telegram.ui.jy;
import org.telegram.ui.lg;
import org.telegram.ui.nd;
import org.telegram.ui.pe;
import org.telegram.ui.py;
import org.telegram.ui.qe;
import org.telegram.ui.sb;
import org.telegram.ui.xn;
import org.telegram.ui.yt0;
public final class f2 implements Utilities.Callback {
    public final int f14009a;
    public final Object f14010b;
    public final Object f14011c;
    public final Object d;
    public final Object f14012e;
    public final Object f14013f;

    public f2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f14009a = i10;
        this.f14010b = obj;
        this.f14011c = obj2;
        this.d = obj3;
        this.f14012e = obj4;
        this.f14013f = obj5;
    }

    @Override
    public final void run(Object obj) {
        final TLRPC.UserFull userFull;
        switch (this.f14009a) {
            case 0:
                g5.r0((g5) this.f14010b, (TL_stars.StarGift) this.f14011c, (TL_stars.StarGiftAttribute) this.d, (sc[]) this.f14012e, (boolean[]) this.f14013f, (ArrayList) obj);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new lh.e1((sb) this.f14010b, (TLRPC.ChannelParticipant) obj, (ArrayList) this.f14011c, (ArrayList) this.d, (ArrayList) this.f14012e, (org.telegram.ui.ra) this.f14013f, 10));
                return;
            case 2:
                final xn xnVar = (xn) this.f14010b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f14011c;
                String str = (String) this.d;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.f14012e;
                CharacterStyle characterStyle = (CharacterStyle) this.f14013f;
                final TLRPC.User user = (TLRPC.User) obj;
                if (user != null) {
                    userFull = xnVar.getMessagesController().getUserFull(user.f20992id);
                } else {
                    userFull = null;
                }
                q70 I = q70.I(xnVar, t1Var);
                im0 im0Var = new im0(xnVar.getParentActivity(), xnVar.f43114ba);
                I.f30328p = new pe(im0Var, 1);
                org.telegram.ui.a0 a0Var = new org.telegram.ui.a0(xnVar, user, str, 2);
                q70 J = I.J();
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new yt0(I, 25), false);
                J.k();
                J.c(R.drawable.msg_addbot, LocaleController.getString(R.string.CreateNewContact), new org.telegram.ui.s1(xnVar, I, str), false);
                J.c(R.drawable.menu_contact_existing, LocaleController.getString(R.string.AddToExistingContact), new yt0(a0Var, 26), false);
                if (tL_contact == null && (user == null || !xnVar.getContactsController().contactsDict.containsKey(Long.valueOf(user.f20992id)))) {
                    I.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), new lh.y2(I, J, 2), false);
                    I.k();
                }
                if (user == null) {
                    I.c(R.drawable.menu_invit_telegram, LocaleController.getString(R.string.InviteToTelegramShort), new qe(xnVar, str, 8), false);
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new qe(xnVar, str, 9), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new qe(xnVar, str, 10), false);
                    I.k();
                    I.p(13, -1, LocaleController.getString(R.string.NumberNotOnTelegram));
                } else {
                    I.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new lg(xnVar, user, 0), false);
                    if (!UserObject.isUserSelf(user)) {
                        I.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoiceCallViaTelegram), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z4;
                                boolean z10;
                                switch (r4) {
                                    case 0:
                                        xn xnVar2 = xnVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            xnVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z4 = true;
                                                org.telegram.ui.Components.voip.g2.m(user, false, z4, xnVar2.getParentActivity(), userFull2, xnVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z4 = false;
                                        org.telegram.ui.Components.voip.g2.m(user, false, z4, xnVar2.getParentActivity(), userFull2, xnVar2.getAccountInstance());
                                        return;
                                    default:
                                        xn xnVar3 = xnVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            xnVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.g2.m(user, true, z10, xnVar3.getParentActivity(), userFull3, xnVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.g2.m(user, true, z10, xnVar3.getParentActivity(), userFull3, xnVar3.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                        I.c(R.drawable.msg_videocall, LocaleController.getString(R.string.VideoCallViaTelegram), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z4;
                                boolean z10;
                                switch (r4) {
                                    case 0:
                                        xn xnVar2 = xnVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            xnVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z4 = true;
                                                org.telegram.ui.Components.voip.g2.m(user, false, z4, xnVar2.getParentActivity(), userFull2, xnVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z4 = false;
                                        org.telegram.ui.Components.voip.g2.m(user, false, z4, xnVar2.getParentActivity(), userFull2, xnVar2.getAccountInstance());
                                        return;
                                    default:
                                        xn xnVar3 = xnVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            xnVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.g2.m(user, true, z10, xnVar3.getParentActivity(), userFull3, xnVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.g2.m(user, true, z10, xnVar3.getParentActivity(), userFull3, xnVar3.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new qe(xnVar, str, 6), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new qe(xnVar, str, 7), false);
                    I.k();
                    I.n(user, LocaleController.getString(R.string.ViewProfile), new org.telegram.ui.s1(xnVar, im0Var, user, 16));
                }
                im0Var.e(I);
                if (characterStyle instanceof n51) {
                    String url = ((n51) characterStyle).getURL();
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
                    im0Var.f(t1Var, characterStyle, spannableString, false);
                } else {
                    im0Var.f(t1Var, characterStyle, null, false);
                }
                xnVar.showDialog(im0Var);
                return;
            case 3:
                xn xnVar2 = (xn) this.f14010b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.f14011c;
                String str2 = (String) this.d;
                MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f14013f;
                Long l10 = (Long) obj;
                int i10 = xnVar2.O3;
                Object obj2 = this.f14012e;
                if (i10 == 1) {
                    org.telegram.ui.Components.z4.M(xnVar2.getParentActivity(), xnVar2.Q5, new a1.d(xnVar2, tL_document, str2, obj2, 5), xnVar2.f43114ba);
                } else {
                    xnVar2.getSendMessagesHelper().sendSticker(tL_document, str2, xnVar2.Q5, xnVar2.f43223k5, xnVar2.U3, null, xnVar2.f43199i5, sendAnimationData, true, 0, 0, false, obj2, xnVar2.C8(), l10.longValue(), xnVar2.N8(), xnVar2.f43135d5);
                    tL_document = tL_document;
                }
                xnVar2.e9(false);
                xnVar2.V.o(tL_document);
                xnVar2.V.setFieldText("");
                return;
            case 4:
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.f14012e;
                ArrayList arrayList3 = (ArrayList) this.f14013f;
                Runnable runnable = (Runnable) obj;
                ly lyVar = ((ky) this.f14010b).f28513a;
                String str3 = lyVar.v;
                ArrayList arrayList4 = lyVar.f28898r;
                ArrayList arrayList5 = lyVar.h;
                ArrayList arrayList6 = lyVar.f28899s;
                mz mzVar = lyVar.C;
                if (((String) this.f14011c).equals(str3)) {
                    iw iwVar = mzVar.S;
                    kx kxVar = mzVar.M;
                    int i11 = 0;
                    iwVar.e(false);
                    lyVar.f28902y = true;
                    f2.p0 adapter = kxVar.getAdapter();
                    ly lyVar2 = mzVar.P;
                    if (adapter != lyVar2) {
                        kxVar.setAdapter(lyVar2);
                    }
                    arrayList5.clear();
                    arrayList5.addAll(lyVar.f28897n);
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                    arrayList6.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj3 = arrayList2.get(i12);
                        i12++;
                        dy dyVar = (dy) obj3;
                        if (longSparseIntArray.indexOfKey(dyVar.f26373c.f20872id) < 0) {
                            longSparseIntArray.append(dyVar.f26373c.f20872id, 1);
                            arrayList6.add(dyVar);
                        }
                    }
                    int size2 = arrayList3.size();
                    while (i11 < size2) {
                        Object obj4 = arrayList3.get(i11);
                        i11++;
                        dy dyVar2 = (dy) obj4;
                        if (longSparseIntArray.indexOfKey(dyVar2.f26373c.f20872id) < 0) {
                            longSparseIntArray.append(dyVar2.f26373c.f20872id, 1);
                            arrayList6.add(dyVar2);
                        }
                    }
                    lyVar.l();
                    return;
                }
                return;
            default:
                py pyVar = (py) this.f14010b;
                Long l11 = (Long) this.d;
                Runnable runnable2 = (Runnable) obj;
                pyVar.getClass();
                ((org.telegram.ui.ActionBar.d2) this.f14011c).dismiss();
                pyVar.getMessagesController().loadChannelParticipants(l11);
                jy jyVar = pyVar.f40278z2;
                pyVar.removeSelfFromStack();
                ((nd) this.f14012e).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.p2) this.f14013f).finishFragment();
                if (jyVar != null) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(MessagesStorage.TopicKey.of(-l11.longValue(), 0L));
                    jyVar.v(pyVar, arrayList7, null, false, pyVar.G2, pyVar.H2, pyVar.I2, null);
                    return;
                }
                return;
        }
    }
}
