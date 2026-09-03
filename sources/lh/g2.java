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
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.ix;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.sc;
import org.telegram.ui.ky;
import org.telegram.ui.ng;
import org.telegram.ui.pd;
import org.telegram.ui.qy;
import org.telegram.ui.re;
import org.telegram.ui.se;
import org.telegram.ui.ub;
import org.telegram.ui.yt0;
import org.telegram.ui.zn;
public final class g2 implements Utilities.Callback {
    public final int f12440a;
    public final Object f12441b;
    public final Object f12442c;
    public final Object d;
    public final Object e;
    public final Object f12443f;

    public g2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f12440a = i10;
        this.f12441b = obj;
        this.f12442c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f12443f = obj5;
    }

    @Override
    public final void run(Object obj) {
        final TLRPC.UserFull userFull;
        switch (this.f12440a) {
            case 0:
                g5.r0((g5) this.f12441b, (TL_stars.StarGift) this.f12442c, (TL_stars.StarGiftAttribute) this.d, (sc[]) this.e, (boolean[]) this.f12443f, (ArrayList) obj);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new kh.e1((ub) this.f12441b, (TLRPC.ChannelParticipant) obj, (ArrayList) this.f12442c, (ArrayList) this.d, (ArrayList) this.e, (org.telegram.ui.ta) this.f12443f, 10));
                return;
            case 2:
                final zn znVar = (zn) this.f12441b;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f12442c;
                String str = (String) this.d;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f12443f;
                final TLRPC.User user = (TLRPC.User) obj;
                if (user != null) {
                    userFull = znVar.getMessagesController().getUserFull(user.f19306id);
                } else {
                    userFull = null;
                }
                p70 I = p70.I(znVar, s1Var);
                hm0 hm0Var = new hm0(znVar.getParentActivity(), znVar.f40534ba);
                I.f27772p = new re(hm0Var, 1);
                org.telegram.ui.b0 b0Var = new org.telegram.ui.b0(znVar, user, str, 2);
                p70 J = I.J();
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new yt0(I, 25), false);
                J.k();
                J.c(R.drawable.msg_addbot, LocaleController.getString(R.string.CreateNewContact), new org.telegram.ui.u1(znVar, I, str), false);
                J.c(R.drawable.menu_contact_existing, LocaleController.getString(R.string.AddToExistingContact), new yt0(b0Var, 26), false);
                if (tL_contact == null && (user == null || !znVar.getContactsController().contactsDict.containsKey(Long.valueOf(user.f19306id)))) {
                    I.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), new kh.y2(I, J, 2), false);
                    I.k();
                }
                if (user == null) {
                    I.c(R.drawable.menu_invit_telegram, LocaleController.getString(R.string.InviteToTelegramShort), new se(znVar, str, 8), false);
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new se(znVar, str, 9), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new se(znVar, str, 10), false);
                    I.k();
                    I.p(13, -1, LocaleController.getString(R.string.NumberNotOnTelegram));
                } else {
                    I.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new ng(znVar, user, 0), false);
                    if (!UserObject.isUserSelf(user)) {
                        I.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoiceCallViaTelegram), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z4;
                                boolean z10;
                                switch (r4) {
                                    case 0:
                                        zn znVar2 = znVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            znVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z4 = true;
                                                org.telegram.ui.Components.voip.f2.m(user, false, z4, znVar2.getParentActivity(), userFull2, znVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z4 = false;
                                        org.telegram.ui.Components.voip.f2.m(user, false, z4, znVar2.getParentActivity(), userFull2, znVar2.getAccountInstance());
                                        return;
                                    default:
                                        zn znVar3 = znVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            znVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.f2.m(user, true, z10, znVar3.getParentActivity(), userFull3, znVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.f2.m(user, true, z10, znVar3.getParentActivity(), userFull3, znVar3.getAccountInstance());
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
                                        zn znVar2 = znVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            znVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z4 = true;
                                                org.telegram.ui.Components.voip.f2.m(user, false, z4, znVar2.getParentActivity(), userFull2, znVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z4 = false;
                                        org.telegram.ui.Components.voip.f2.m(user, false, z4, znVar2.getParentActivity(), userFull2, znVar2.getAccountInstance());
                                        return;
                                    default:
                                        zn znVar3 = znVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            znVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.f2.m(user, true, z10, znVar3.getParentActivity(), userFull3, znVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.f2.m(user, true, z10, znVar3.getParentActivity(), userFull3, znVar3.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new se(znVar, str, 6), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new se(znVar, str, 7), false);
                    I.k();
                    I.n(user, LocaleController.getString(R.string.ViewProfile), new org.telegram.ui.u1(znVar, hm0Var, user, 16));
                }
                hm0Var.e(I);
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
                    hm0Var.f(s1Var, characterStyle, spannableString, false);
                } else {
                    hm0Var.f(s1Var, characterStyle, null, false);
                }
                znVar.showDialog(hm0Var);
                return;
            case 3:
                zn znVar2 = (zn) this.f12441b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.f12442c;
                String str2 = (String) this.d;
                MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f12443f;
                Long l10 = (Long) obj;
                int i10 = znVar2.O3;
                Object obj2 = this.e;
                if (i10 == 1) {
                    org.telegram.ui.Components.z4.M(znVar2.getParentActivity(), znVar2.Q5, new a1.d(znVar2, tL_document, str2, obj2, 5), znVar2.f40534ba);
                } else {
                    znVar2.getSendMessagesHelper().sendSticker(tL_document, str2, znVar2.Q5, znVar2.f40642k5, znVar2.U3, null, znVar2.f40618i5, sendAnimationData, true, 0, 0, false, obj2, znVar2.C8(), l10.longValue(), znVar2.N8(), znVar2.f40555d5);
                    tL_document = tL_document;
                }
                znVar2.e9(false);
                znVar2.V.o(tL_document);
                znVar2.V.setFieldText("");
                return;
            case 4:
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.f12443f;
                Runnable runnable = (Runnable) obj;
                jy jyVar = ((iy) this.f12441b).f25785a;
                String str3 = jyVar.v;
                ArrayList arrayList4 = jyVar.f26072r;
                ArrayList arrayList5 = jyVar.h;
                ArrayList arrayList6 = jyVar.f26073s;
                kz kzVar = jyVar.C;
                if (((String) this.f12442c).equals(str3)) {
                    gw gwVar = kzVar.S;
                    ix ixVar = kzVar.M;
                    int i11 = 0;
                    gwVar.e(false);
                    jyVar.f26076y = true;
                    f2.o0 adapter = ixVar.getAdapter();
                    jy jyVar2 = kzVar.P;
                    if (adapter != jyVar2) {
                        ixVar.setAdapter(jyVar2);
                    }
                    arrayList5.clear();
                    arrayList5.addAll(jyVar.f26071n);
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
                        if (longSparseIntArray.indexOfKey(ayVar.f23497c.f19186id) < 0) {
                            longSparseIntArray.append(ayVar.f23497c.f19186id, 1);
                            arrayList6.add(ayVar);
                        }
                    }
                    int size2 = arrayList3.size();
                    while (i11 < size2) {
                        Object obj4 = arrayList3.get(i11);
                        i11++;
                        ay ayVar2 = (ay) obj4;
                        if (longSparseIntArray.indexOfKey(ayVar2.f23497c.f19186id) < 0) {
                            longSparseIntArray.append(ayVar2.f23497c.f19186id, 1);
                            arrayList6.add(ayVar2);
                        }
                    }
                    jyVar.l();
                    return;
                }
                return;
            default:
                qy qyVar = (qy) this.f12441b;
                Long l11 = (Long) this.d;
                Runnable runnable2 = (Runnable) obj;
                qyVar.getClass();
                ((org.telegram.ui.ActionBar.d2) this.f12442c).dismiss();
                qyVar.getMessagesController().loadChannelParticipants(l11);
                ky kyVar = qyVar.f37649z2;
                qyVar.removeSelfFromStack();
                ((pd) this.e).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.p2) this.f12443f).finishFragment();
                if (kyVar != null) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(MessagesStorage.TopicKey.of(-l11.longValue(), 0L));
                    kyVar.w(qyVar, arrayList7, null, false, qyVar.G2, qyVar.H2, qyVar.I2, null);
                    return;
                }
                return;
        }
    }
}
