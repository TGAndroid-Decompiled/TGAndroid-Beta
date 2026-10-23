package ai;

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
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.rw;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.cy;
import org.telegram.ui.ig;
import org.telegram.ui.qe;
import org.telegram.ui.qn;
import org.telegram.ui.re;
import org.telegram.ui.st0;
import org.telegram.ui.vx;
public final class f3 implements Utilities.Callback {
    public final int f1251a;
    public final Object f1252b;
    public final Object f1253c;
    public final Object d;
    public final Object e;
    public final Object f1254f;

    public f3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f1251a = i10;
        this.f1252b = obj;
        this.f1253c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f1254f = obj5;
    }

    @Override
    public final void run(Object obj) {
        final TLRPC.UserFull userFull;
        switch (this.f1251a) {
            case 0:
                l7.a1((l7) this.f1252b, (TL_stars.StarGift) this.f1253c, (TL_stars.StarGiftAttribute) this.d, (org.telegram.ui.Components.zc[]) this.e, (boolean[]) this.f1254f, (ArrayList) obj);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new g3((org.telegram.ui.vb) this.f1252b, (TLRPC.ChannelParticipant) obj, (ArrayList) this.f1253c, (ArrayList) this.d, (ArrayList) this.e, (org.telegram.ui.ta) this.f1254f, 12));
                return;
            case 2:
                qn qnVar = (qn) this.f1252b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.f1253c;
                String str = (String) this.d;
                MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f1254f;
                Long l4 = (Long) obj;
                int i10 = qnVar.R3;
                Object obj2 = this.e;
                if (i10 == 1) {
                    org.telegram.ui.Components.f5.L(qnVar.getParentActivity(), qnVar.T5, new a1.d(qnVar, tL_document, str, obj2, 6), qnVar.f40677ea);
                } else {
                    qnVar.getSendMessagesHelper().sendSticker(tL_document, str, qnVar.T5, qnVar.f40783n5, qnVar.X3, null, qnVar.f40757l5, sendAnimationData, true, 0, 0, false, obj2, qnVar.H8(), l4.longValue(), qnVar.S8(), qnVar.f40697g5);
                    tL_document = tL_document;
                }
                qnVar.j9(false);
                qnVar.Y.m(tL_document);
                qnVar.Y.setFieldText("");
                return;
            case 3:
                final qn qnVar2 = (qn) this.f1252b;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f1253c;
                String str2 = (String) this.d;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f1254f;
                final TLRPC.User user = (TLRPC.User) obj;
                if (user != null) {
                    userFull = qnVar2.getMessagesController().getUserFull(user.f20427id);
                } else {
                    userFull = null;
                }
                i80 I = i80.I(qnVar2, u1Var);
                zm0 zm0Var = new zm0(qnVar2.getParentActivity(), qnVar2.f40677ea);
                I.f27184p = new qe(zm0Var, 1);
                org.telegram.ui.z zVar = new org.telegram.ui.z(qnVar2, user, str2, 2);
                i80 J = I.J();
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new st0(I, 26), false);
                J.k();
                J.c(R.drawable.msg_addbot, LocaleController.getString(R.string.CreateNewContact), new org.telegram.ui.t1(qnVar2, I, str2), false);
                J.c(R.drawable.menu_contact_existing, LocaleController.getString(R.string.AddToExistingContact), new st0(zVar, 27), false);
                if (tL_contact == null && (user == null || !qnVar2.getContactsController().contactsDict.containsKey(Long.valueOf(user.f20427id)))) {
                    I.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), new gi.g2(I, J, 4), false);
                    I.k();
                }
                if (user == null) {
                    I.c(R.drawable.menu_invit_telegram, LocaleController.getString(R.string.InviteToTelegramShort), new re(qnVar2, str2, 8), false);
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new re(qnVar2, str2, 9), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new re(qnVar2, str2, 10), false);
                    I.k();
                    I.p(13, -1, LocaleController.getString(R.string.NumberNotOnTelegram));
                } else {
                    I.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new ig(qnVar2, user, 0), false);
                    if (!UserObject.isUserSelf(user)) {
                        I.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoiceCallViaTelegram), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (r4) {
                                    case 0:
                                        qn qnVar3 = qnVar2;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            qnVar3.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                boolean z12 = z10;
                                                org.telegram.ui.Components.voip.d2.m(user, false, z12, qnVar3.getParentActivity(), userFull2, qnVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        boolean z122 = z10;
                                        org.telegram.ui.Components.voip.d2.m(user, false, z122, qnVar3.getParentActivity(), userFull2, qnVar3.getAccountInstance());
                                        return;
                                    default:
                                        qn qnVar4 = qnVar2;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            qnVar4.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                boolean z13 = z11;
                                                org.telegram.ui.Components.voip.d2.m(user, true, z13, qnVar4.getParentActivity(), userFull3, qnVar4.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        boolean z132 = z11;
                                        org.telegram.ui.Components.voip.d2.m(user, true, z132, qnVar4.getParentActivity(), userFull3, qnVar4.getAccountInstance());
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
                                        qn qnVar3 = qnVar2;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            qnVar3.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                boolean z122 = z10;
                                                org.telegram.ui.Components.voip.d2.m(user, false, z122, qnVar3.getParentActivity(), userFull2, qnVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        boolean z1222 = z10;
                                        org.telegram.ui.Components.voip.d2.m(user, false, z1222, qnVar3.getParentActivity(), userFull2, qnVar3.getAccountInstance());
                                        return;
                                    default:
                                        qn qnVar4 = qnVar2;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            qnVar4.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                boolean z132 = z11;
                                                org.telegram.ui.Components.voip.d2.m(user, true, z132, qnVar4.getParentActivity(), userFull3, qnVar4.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        boolean z1322 = z11;
                                        org.telegram.ui.Components.voip.d2.m(user, true, z1322, qnVar4.getParentActivity(), userFull3, qnVar4.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new re(qnVar2, str2, 6), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new re(qnVar2, str2, 7), false);
                    I.k();
                    I.n(user, LocaleController.getString(R.string.ViewProfile), new org.telegram.ui.t1(qnVar2, zm0Var, user, 17));
                }
                zm0Var.e(I);
                if (characterStyle instanceof n61) {
                    String url = ((n61) characterStyle).getURL();
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
                    zm0Var.f(u1Var, characterStyle, spannableString, false);
                } else {
                    zm0Var.f(u1Var, characterStyle, null, false);
                }
                qnVar2.showDialog(zm0Var);
                return;
            case 4:
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.f1254f;
                Runnable runnable = (Runnable) obj;
                ty tyVar = ((sy) this.f1252b).f30377a;
                String str3 = tyVar.v;
                ArrayList arrayList4 = tyVar.f30713r;
                ArrayList arrayList5 = tyVar.h;
                ArrayList arrayList6 = tyVar.f30714s;
                tz tzVar = tyVar.F;
                if (((String) this.f1253c).equals(str3)) {
                    rw rwVar = tzVar.V;
                    ey eyVar = tzVar.P;
                    int i11 = 0;
                    rwVar.e(false);
                    tyVar.f30717y = true;
                    s4.g0 adapter = eyVar.getAdapter();
                    ty tyVar2 = tzVar.S;
                    if (adapter != tyVar2) {
                        eyVar.setAdapter(tyVar2);
                    }
                    arrayList5.clear();
                    arrayList5.addAll(tyVar.f30712n);
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                    arrayList6.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj3 = arrayList2.get(i12);
                        i12++;
                        ky kyVar = (ky) obj3;
                        if (longSparseIntArray.indexOfKey(kyVar.f27985c.f20307id) < 0) {
                            longSparseIntArray.append(kyVar.f27985c.f20307id, 1);
                            arrayList6.add(kyVar);
                        }
                    }
                    int size2 = arrayList3.size();
                    while (i11 < size2) {
                        Object obj4 = arrayList3.get(i11);
                        i11++;
                        ky kyVar2 = (ky) obj4;
                        if (longSparseIntArray.indexOfKey(kyVar2.f27985c.f20307id) < 0) {
                            longSparseIntArray.append(kyVar2.f27985c.f20307id, 1);
                            arrayList6.add(kyVar2);
                        }
                    }
                    tyVar.l();
                    return;
                }
                return;
            default:
                cy cyVar = (cy) this.f1252b;
                Long l10 = (Long) this.d;
                Runnable runnable2 = (Runnable) obj;
                cyVar.getClass();
                ((org.telegram.ui.ActionBar.b2) this.f1253c).dismiss();
                cyVar.getMessagesController().loadChannelParticipants(l10);
                vx vxVar = cyVar.C2;
                cyVar.removeSelfFromStack();
                ((org.telegram.ui.md) this.e).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.n2) this.f1254f).finishFragment();
                if (vxVar != null) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(MessagesStorage.TopicKey.of(-l10.longValue(), 0L));
                    vxVar.w(cyVar, arrayList7, null, false, cyVar.J2, cyVar.K2, cyVar.L2, null);
                    return;
                }
                return;
        }
    }
}
