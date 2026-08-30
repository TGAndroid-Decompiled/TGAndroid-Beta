package lh;

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
import org.telegram.ui.Components.ay;
import org.telegram.ui.Components.gw;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.ix;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.sc;
import org.telegram.ui.lg;
import org.telegram.ui.nd;
import org.telegram.ui.oy;
import org.telegram.ui.pe;
import org.telegram.ui.qe;
import org.telegram.ui.rt0;
import org.telegram.ui.sb;
import org.telegram.ui.xn;
public final class g2 implements Utilities.Callback {
    public final int f12456a;
    public final Object f12457b;
    public final Object f12458c;
    public final Object d;
    public final Object e;
    public final Object f12459f;

    public g2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f12456a = i10;
        this.f12457b = obj;
        this.f12458c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f12459f = obj5;
    }

    @Override
    public final void run(Object obj) {
        final TLRPC.UserFull userFull;
        switch (this.f12456a) {
            case 0:
                g5.r0((g5) this.f12457b, (TL_stars.StarGift) this.f12458c, (TL_stars.StarGiftAttribute) this.d, (sc[]) this.e, (boolean[]) this.f12459f, (ArrayList) obj);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new kh.e1((sb) this.f12457b, (TLRPC.ChannelParticipant) obj, (ArrayList) this.f12458c, (ArrayList) this.d, (ArrayList) this.e, (org.telegram.ui.ra) this.f12459f, 10));
                return;
            case 2:
                final xn xnVar = (xn) this.f12457b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f12458c;
                String str = (String) this.d;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f12459f;
                final TLRPC.User user = (TLRPC.User) obj;
                if (user != null) {
                    userFull = xnVar.getMessagesController().getUserFull(user.f19331id);
                } else {
                    userFull = null;
                }
                o70 I = o70.I(xnVar, t1Var);
                im0 im0Var = new im0(xnVar.getParentActivity(), xnVar.f39968ba);
                I.f27484p = new pe(im0Var, 1);
                org.telegram.ui.a0 a0Var = new org.telegram.ui.a0(xnVar, user, str, 2);
                o70 J = I.J();
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new rt0(I, 25), false);
                J.k();
                J.c(R.drawable.msg_addbot, LocaleController.getString(R.string.CreateNewContact), new org.telegram.ui.s1(xnVar, I, str), false);
                J.c(R.drawable.menu_contact_existing, LocaleController.getString(R.string.AddToExistingContact), new rt0(a0Var, 26), false);
                if (tL_contact == null && (user == null || !xnVar.getContactsController().contactsDict.containsKey(Long.valueOf(user.f19331id)))) {
                    I.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), new kh.z2(I, J, 2), false);
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
                                                org.telegram.ui.Components.voip.f2.n(user, false, z4, xnVar2.getParentActivity(), userFull2, xnVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z4 = false;
                                        org.telegram.ui.Components.voip.f2.n(user, false, z4, xnVar2.getParentActivity(), userFull2, xnVar2.getAccountInstance());
                                        return;
                                    default:
                                        xn xnVar3 = xnVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            xnVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.f2.n(user, true, z10, xnVar3.getParentActivity(), userFull3, xnVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.f2.n(user, true, z10, xnVar3.getParentActivity(), userFull3, xnVar3.getAccountInstance());
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
                                                org.telegram.ui.Components.voip.f2.n(user, false, z4, xnVar2.getParentActivity(), userFull2, xnVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z4 = false;
                                        org.telegram.ui.Components.voip.f2.n(user, false, z4, xnVar2.getParentActivity(), userFull2, xnVar2.getAccountInstance());
                                        return;
                                    default:
                                        xn xnVar3 = xnVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            xnVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.f2.n(user, true, z10, xnVar3.getParentActivity(), userFull3, xnVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.f2.n(user, true, z10, xnVar3.getParentActivity(), userFull3, xnVar3.getAccountInstance());
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
                if (characterStyle instanceof o51) {
                    String url = ((o51) characterStyle).getURL();
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
                xn xnVar2 = (xn) this.f12457b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.f12458c;
                String str2 = (String) this.d;
                MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f12459f;
                Long l10 = (Long) obj;
                int i10 = xnVar2.O3;
                Object obj2 = this.e;
                if (i10 == 1) {
                    org.telegram.ui.Components.z4.M(xnVar2.getParentActivity(), xnVar2.Q5, new a1.d(xnVar2, tL_document, str2, obj2, 5), xnVar2.f39968ba);
                } else {
                    xnVar2.getSendMessagesHelper().sendSticker(tL_document, str2, xnVar2.Q5, xnVar2.f40076k5, xnVar2.U3, null, xnVar2.f40052i5, sendAnimationData, true, 0, 0, false, obj2, xnVar2.C8(), l10.longValue(), xnVar2.N8(), xnVar2.f39989d5);
                    tL_document = tL_document;
                }
                xnVar2.e9(false);
                xnVar2.V.o(tL_document);
                xnVar2.V.setFieldText("");
                return;
            case 4:
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.f12459f;
                Runnable runnable = (Runnable) obj;
                jy jyVar = ((iy) this.f12457b).f25796a;
                String str3 = jyVar.v;
                ArrayList arrayList4 = jyVar.f26062r;
                ArrayList arrayList5 = jyVar.h;
                ArrayList arrayList6 = jyVar.f26063s;
                kz kzVar = jyVar.C;
                if (((String) this.f12458c).equals(str3)) {
                    gw gwVar = kzVar.S;
                    ix ixVar = kzVar.M;
                    int i11 = 0;
                    gwVar.e(false);
                    jyVar.f26066y = true;
                    f2.o0 adapter = ixVar.getAdapter();
                    jy jyVar2 = kzVar.P;
                    if (adapter != jyVar2) {
                        ixVar.setAdapter(jyVar2);
                    }
                    arrayList5.clear();
                    arrayList5.addAll(jyVar.f26061n);
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                    arrayList6.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj3 = arrayList2.get(i12);
                        i12++;
                        ay ayVar = (ay) obj3;
                        if (longSparseIntArray.indexOfKey(ayVar.f23525c.f19211id) < 0) {
                            longSparseIntArray.append(ayVar.f23525c.f19211id, 1);
                            arrayList6.add(ayVar);
                        }
                    }
                    int size2 = arrayList3.size();
                    while (i11 < size2) {
                        Object obj4 = arrayList3.get(i11);
                        i11++;
                        ay ayVar2 = (ay) obj4;
                        if (longSparseIntArray.indexOfKey(ayVar2.f23525c.f19211id) < 0) {
                            longSparseIntArray.append(ayVar2.f23525c.f19211id, 1);
                            arrayList6.add(ayVar2);
                        }
                    }
                    jyVar.l();
                    return;
                }
                return;
            default:
                oy oyVar = (oy) this.f12457b;
                Long l11 = (Long) this.d;
                Runnable runnable2 = (Runnable) obj;
                oyVar.getClass();
                ((org.telegram.ui.ActionBar.d2) this.f12458c).dismiss();
                oyVar.getMessagesController().loadChannelParticipants(l11);
                org.telegram.ui.iy iyVar = oyVar.f37131z2;
                oyVar.removeSelfFromStack();
                ((nd) this.e).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.p2) this.f12459f).finishFragment();
                if (iyVar != null) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(MessagesStorage.TopicKey.of(-l11.longValue(), 0L));
                    iyVar.w(oyVar, arrayList7, null, false, oyVar.G2, oyVar.H2, oyVar.I2, null);
                    return;
                }
                return;
        }
    }
}
