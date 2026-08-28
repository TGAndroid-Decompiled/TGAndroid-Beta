package gh;

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
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ox;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.ux;
import org.telegram.ui.Components.vx;
import org.telegram.ui.Components.wv;
import org.telegram.ui.Components.ww;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.x60;
import org.telegram.ui.dy;
import org.telegram.ui.hg;
import org.telegram.ui.id;
import org.telegram.ui.ke;
import org.telegram.ui.kt0;
import org.telegram.ui.le;
import org.telegram.ui.pb;
import org.telegram.ui.qn;
import org.telegram.ui.wx;
public final class i2 implements Utilities.Callback {
    public final int f8272a;
    public final Object f8273b;
    public final Object f8274c;
    public final Object d;
    public final Object f8275e;
    public final Object f8276f;

    public i2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i9) {
        this.f8272a = i9;
        this.f8273b = obj;
        this.f8274c = obj2;
        this.d = obj3;
        this.f8275e = obj4;
        this.f8276f = obj5;
    }

    @Override
    public final void run(Object obj) {
        final TLRPC.UserFull userFull;
        switch (this.f8272a) {
            case 0:
                k5.q0((k5) this.f8273b, (TL_stars.StarGift) this.f8274c, (TL_stars.StarGiftAttribute) this.d, (qc[]) this.f8275e, (boolean[]) this.f8276f, (ArrayList) obj);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new fh.k1((pb) this.f8273b, (TLRPC.ChannelParticipant) obj, (ArrayList) this.f8274c, (ArrayList) this.d, (ArrayList) this.f8275e, (org.telegram.ui.oa) this.f8276f, 13));
                return;
            case 2:
                final qn qnVar = (qn) this.f8273b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f8274c;
                String str = (String) this.d;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.f8275e;
                CharacterStyle characterStyle = (CharacterStyle) this.f8276f;
                final TLRPC.User user = (TLRPC.User) obj;
                if (user != null) {
                    userFull = qnVar.getMessagesController().getUserFull(user.f22527id);
                } else {
                    userFull = null;
                }
                x60 I = x60.I(qnVar, t1Var);
                ll0 ll0Var = new ll0(qnVar.getParentActivity(), qnVar.f41848aa);
                I.f34575p = new ke(ll0Var, 1);
                org.telegram.ui.a0 a0Var = new org.telegram.ui.a0(qnVar, user, str, 2);
                x60 J = I.J();
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new kt0(I, 25), false);
                J.k();
                J.c(R.drawable.msg_addbot, LocaleController.getString(R.string.CreateNewContact), new org.telegram.ui.t1(qnVar, I, str), false);
                J.c(R.drawable.menu_contact_existing, LocaleController.getString(R.string.AddToExistingContact), new kt0(a0Var, 26), false);
                if (tL_contact == null && (user == null || !qnVar.getContactsController().contactsDict.containsKey(Long.valueOf(user.f22527id)))) {
                    I.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), new fh.k3(I, J, 3), false);
                    I.k();
                }
                if (user == null) {
                    I.c(R.drawable.menu_invit_telegram, LocaleController.getString(R.string.InviteToTelegramShort), new le(qnVar, str, 8), false);
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new le(qnVar, str, 9), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new le(qnVar, str, 10), false);
                    I.k();
                    I.p(13, -1, LocaleController.getString(R.string.NumberNotOnTelegram));
                } else {
                    I.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new hg(qnVar, user, 0), false);
                    if (!UserObject.isUserSelf(user)) {
                        I.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoiceCallViaTelegram), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (r4) {
                                    case 0:
                                        qn qnVar2 = qnVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            qnVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.e2.n(user, false, z10, qnVar2.getParentActivity(), userFull2, qnVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.e2.n(user, false, z10, qnVar2.getParentActivity(), userFull2, qnVar2.getAccountInstance());
                                        return;
                                    default:
                                        qn qnVar3 = qnVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            qnVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                org.telegram.ui.Components.voip.e2.n(user, true, z11, qnVar3.getParentActivity(), userFull3, qnVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        org.telegram.ui.Components.voip.e2.n(user, true, z11, qnVar3.getParentActivity(), userFull3, qnVar3.getAccountInstance());
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
                                        qn qnVar2 = qnVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            qnVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.e2.n(user, false, z10, qnVar2.getParentActivity(), userFull2, qnVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.e2.n(user, false, z10, qnVar2.getParentActivity(), userFull2, qnVar2.getAccountInstance());
                                        return;
                                    default:
                                        qn qnVar3 = qnVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            qnVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                org.telegram.ui.Components.voip.e2.n(user, true, z11, qnVar3.getParentActivity(), userFull3, qnVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        org.telegram.ui.Components.voip.e2.n(user, true, z11, qnVar3.getParentActivity(), userFull3, qnVar3.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new le(qnVar, str, 6), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new le(qnVar, str, 7), false);
                    I.k();
                    I.n(user, LocaleController.getString(R.string.ViewProfile), new org.telegram.ui.t1(qnVar, ll0Var, user, 16));
                }
                ll0Var.e(I);
                if (characterStyle instanceof r41) {
                    String url = ((r41) characterStyle).getURL();
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
                    ll0Var.f(t1Var, characterStyle, spannableString, false);
                } else {
                    ll0Var.f(t1Var, characterStyle, null, false);
                }
                qnVar.showDialog(ll0Var);
                return;
            case 3:
                qn qnVar2 = (qn) this.f8273b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.f8274c;
                String str2 = (String) this.d;
                MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f8276f;
                Long l10 = (Long) obj;
                int i9 = qnVar2.N3;
                Object obj2 = this.f8275e;
                if (i9 == 1) {
                    org.telegram.ui.Components.y4.M(qnVar2.getParentActivity(), qnVar2.P5, new a1.d(qnVar2, tL_document, str2, obj2, 6), qnVar2.f41848aa);
                } else {
                    qnVar2.getSendMessagesHelper().sendSticker(tL_document, str2, qnVar2.P5, qnVar2.f41959j5, qnVar2.T3, null, qnVar2.f41934h5, sendAnimationData, true, 0, 0, false, obj2, qnVar2.C8(), l10.longValue(), qnVar2.N8(), qnVar2.f41870c5);
                    tL_document = tL_document;
                }
                qnVar2.e9(false);
                qnVar2.U.o(tL_document);
                qnVar2.U.setFieldText("");
                return;
            case 4:
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.f8275e;
                ArrayList arrayList3 = (ArrayList) this.f8276f;
                Runnable runnable = (Runnable) obj;
                vx vxVar = ((ux) this.f8273b).f33157a;
                String str3 = vxVar.v;
                ArrayList arrayList4 = vxVar.f34016r;
                ArrayList arrayList5 = vxVar.h;
                ArrayList arrayList6 = vxVar.f34017s;
                wy wyVar = vxVar.B;
                if (((String) this.f8274c).equals(str3)) {
                    wv wvVar = wyVar.R;
                    ww wwVar = wyVar.L;
                    int i10 = 0;
                    wvVar.e(false);
                    vxVar.f34020y = true;
                    f2.r0 adapter = wwVar.getAdapter();
                    vx vxVar2 = wyVar.O;
                    if (adapter != vxVar2) {
                        wwVar.setAdapter(vxVar2);
                    }
                    arrayList5.clear();
                    arrayList5.addAll(vxVar.f34015n);
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                    arrayList6.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList2.get(i11);
                        i11++;
                        ox oxVar = (ox) obj3;
                        if (longSparseIntArray.indexOfKey(oxVar.f31459c.f22407id) < 0) {
                            longSparseIntArray.append(oxVar.f31459c.f22407id, 1);
                            arrayList6.add(oxVar);
                        }
                    }
                    int size2 = arrayList3.size();
                    while (i10 < size2) {
                        Object obj4 = arrayList3.get(i10);
                        i10++;
                        ox oxVar2 = (ox) obj4;
                        if (longSparseIntArray.indexOfKey(oxVar2.f31459c.f22407id) < 0) {
                            longSparseIntArray.append(oxVar2.f31459c.f22407id, 1);
                            arrayList6.add(oxVar2);
                        }
                    }
                    vxVar.l();
                    return;
                }
                return;
            default:
                dy dyVar = (dy) this.f8273b;
                Long l11 = (Long) this.d;
                Runnable runnable2 = (Runnable) obj;
                dyVar.getClass();
                ((org.telegram.ui.ActionBar.c2) this.f8274c).dismiss();
                dyVar.getMessagesController().loadChannelParticipants(l11);
                wx wxVar = dyVar.f37752y2;
                dyVar.removeSelfFromStack();
                ((id) this.f8275e).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.o2) this.f8276f).finishFragment();
                if (wxVar != null) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(MessagesStorage.TopicKey.of(-l11.longValue(), 0L));
                    wxVar.v(dyVar, arrayList7, null, false, dyVar.F2, dyVar.G2, dyVar.H2, null);
                    return;
                }
                return;
        }
    }
}
