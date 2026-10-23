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
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.rw;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.tz;
import org.telegram.ui.bg;
import org.telegram.ui.qe;
import org.telegram.ui.re;
import org.telegram.ui.sn;
import org.telegram.ui.vt0;
import org.telegram.ui.xx;
public final class f3 implements Utilities.Callback {
    public final int f1254a;
    public final Object f1255b;
    public final Object f1256c;
    public final Object d;
    public final Object e;
    public final Object f1257f;

    public f3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f1254a = i10;
        this.f1255b = obj;
        this.f1256c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f1257f = obj5;
    }

    @Override
    public final void run(Object obj) {
        final TLRPC.UserFull userFull;
        switch (this.f1254a) {
            case 0:
                l7.Z0((l7) this.f1255b, (TL_stars.StarGift) this.f1256c, (TL_stars.StarGiftAttribute) this.d, (org.telegram.ui.Components.zc[]) this.e, (boolean[]) this.f1257f, (ArrayList) obj);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new g3((org.telegram.ui.vb) this.f1255b, (TLRPC.ChannelParticipant) obj, (ArrayList) this.f1256c, (ArrayList) this.d, (ArrayList) this.e, (org.telegram.ui.ta) this.f1257f, 12));
                return;
            case 2:
                sn snVar = (sn) this.f1255b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.f1256c;
                String str = (String) this.d;
                MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f1257f;
                Long l4 = (Long) obj;
                int i10 = snVar.f41492d4;
                Object obj2 = this.e;
                if (i10 == 1) {
                    org.telegram.ui.Components.f5.M(snVar.getParentActivity(), snVar.f41519f6, new a1.d(snVar, tL_document, str, obj2, 6), snVar.f41654qa);
                } else {
                    snVar.getSendMessagesHelper().sendSticker(tL_document, str, snVar.f41519f6, snVar.f41767z5, snVar.f41564j4, null, snVar.f41742x5, sendAnimationData, true, 0, 0, false, obj2, snVar.H8(), l4.longValue(), snVar.S8(), snVar.f41677s5);
                    tL_document = tL_document;
                }
                snVar.j9(false);
                snVar.Y.l(tL_document);
                snVar.Y.setFieldText("");
                return;
            case 3:
                final sn snVar2 = (sn) this.f1255b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f1256c;
                String str2 = (String) this.d;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f1257f;
                final TLRPC.User user = (TLRPC.User) obj;
                if (user != null) {
                    userFull = snVar2.getMessagesController().getUserFull(user.f20490id);
                } else {
                    userFull = null;
                }
                j80 I = j80.I(snVar2, t1Var);
                cn0 cn0Var = new cn0(snVar2.getParentActivity(), snVar2.f41654qa);
                I.f27575p = new qe(cn0Var, 1);
                org.telegram.ui.y yVar = new org.telegram.ui.y(snVar2, user, str2, 2);
                j80 J = I.J();
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new vt0(I, 26), false);
                J.k();
                J.c(R.drawable.msg_addbot, LocaleController.getString(R.string.CreateNewContact), new org.telegram.ui.s1(snVar2, I, str2), false);
                J.c(R.drawable.menu_contact_existing, LocaleController.getString(R.string.AddToExistingContact), new vt0(yVar, 27), false);
                if (tL_contact == null && (user == null || !snVar2.getContactsController().contactsDict.containsKey(Long.valueOf(user.f20490id)))) {
                    I.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), new gi.g2(I, J, 4), false);
                    I.k();
                }
                if (user == null) {
                    I.c(R.drawable.menu_invit_telegram, LocaleController.getString(R.string.InviteToTelegramShort), new re(snVar2, str2, 7), false);
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new re(snVar2, str2, 8), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new re(snVar2, str2, 9), false);
                    I.k();
                    I.p(13, -1, LocaleController.getString(R.string.NumberNotOnTelegram));
                } else {
                    I.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new bg(snVar2, user, 0), false);
                    if (!UserObject.isUserSelf(user)) {
                        I.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoiceCallViaTelegram), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (r4) {
                                    case 0:
                                        sn snVar3 = snVar2;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            snVar3.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                boolean z12 = z10;
                                                org.telegram.ui.Components.voip.d2.m(user, false, z12, snVar3.getParentActivity(), userFull2, snVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        boolean z122 = z10;
                                        org.telegram.ui.Components.voip.d2.m(user, false, z122, snVar3.getParentActivity(), userFull2, snVar3.getAccountInstance());
                                        return;
                                    default:
                                        sn snVar4 = snVar2;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            snVar4.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                boolean z13 = z11;
                                                org.telegram.ui.Components.voip.d2.m(user, true, z13, snVar4.getParentActivity(), userFull3, snVar4.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        boolean z132 = z11;
                                        org.telegram.ui.Components.voip.d2.m(user, true, z132, snVar4.getParentActivity(), userFull3, snVar4.getAccountInstance());
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
                                        sn snVar3 = snVar2;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            snVar3.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                boolean z122 = z10;
                                                org.telegram.ui.Components.voip.d2.m(user, false, z122, snVar3.getParentActivity(), userFull2, snVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        boolean z1222 = z10;
                                        org.telegram.ui.Components.voip.d2.m(user, false, z1222, snVar3.getParentActivity(), userFull2, snVar3.getAccountInstance());
                                        return;
                                    default:
                                        sn snVar4 = snVar2;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            snVar4.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                boolean z132 = z11;
                                                org.telegram.ui.Components.voip.d2.m(user, true, z132, snVar4.getParentActivity(), userFull3, snVar4.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        boolean z1322 = z11;
                                        org.telegram.ui.Components.voip.d2.m(user, true, z1322, snVar4.getParentActivity(), userFull3, snVar4.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new re(snVar2, str2, 5), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new re(snVar2, str2, 6), false);
                    I.k();
                    I.n(user, LocaleController.getString(R.string.ViewProfile), new org.telegram.ui.s1(snVar2, cn0Var, user, 17));
                }
                cn0Var.e(I);
                if (characterStyle instanceof s61) {
                    String url = ((s61) characterStyle).getURL();
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
                    cn0Var.f(t1Var, characterStyle, spannableString, false);
                } else {
                    cn0Var.f(t1Var, characterStyle, null, false);
                }
                snVar2.showDialog(cn0Var);
                return;
            case 4:
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.f1257f;
                Runnable runnable = (Runnable) obj;
                ty tyVar = ((sy) this.f1255b).f30571a;
                String str3 = tyVar.v;
                ArrayList arrayList4 = tyVar.f30921r;
                ArrayList arrayList5 = tyVar.h;
                ArrayList arrayList6 = tyVar.f30922s;
                tz tzVar = tyVar.F;
                if (((String) this.f1256c).equals(str3)) {
                    rw rwVar = tzVar.V;
                    ey eyVar = tzVar.P;
                    int i11 = 0;
                    rwVar.e(false);
                    tyVar.f30925y = true;
                    s4.g0 adapter = eyVar.getAdapter();
                    ty tyVar2 = tzVar.S;
                    if (adapter != tyVar2) {
                        eyVar.setAdapter(tyVar2);
                    }
                    arrayList5.clear();
                    arrayList5.addAll(tyVar.f30920n);
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
                        if (longSparseIntArray.indexOfKey(kyVar.f28177c.f20370id) < 0) {
                            longSparseIntArray.append(kyVar.f28177c.f20370id, 1);
                            arrayList6.add(kyVar);
                        }
                    }
                    int size2 = arrayList3.size();
                    while (i11 < size2) {
                        Object obj4 = arrayList3.get(i11);
                        i11++;
                        ky kyVar2 = (ky) obj4;
                        if (longSparseIntArray.indexOfKey(kyVar2.f28177c.f20370id) < 0) {
                            longSparseIntArray.append(kyVar2.f28177c.f20370id, 1);
                            arrayList6.add(kyVar2);
                        }
                    }
                    tyVar.l();
                    return;
                }
                return;
            default:
                org.telegram.ui.ey eyVar2 = (org.telegram.ui.ey) this.f1255b;
                Long l10 = (Long) this.d;
                Runnable runnable2 = (Runnable) obj;
                eyVar2.getClass();
                ((org.telegram.ui.ActionBar.c2) this.f1256c).dismiss();
                eyVar2.getMessagesController().loadChannelParticipants(l10);
                xx xxVar = eyVar2.C2;
                eyVar2.removeSelfFromStack();
                ((org.telegram.ui.md) this.e).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.o2) this.f1257f).finishFragment();
                if (xxVar != null) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(MessagesStorage.TopicKey.of(-l10.longValue(), 0L));
                    xxVar.w(eyVar2, arrayList7, null, false, eyVar2.J2, eyVar2.K2, eyVar2.L2, null);
                    return;
                }
                return;
        }
    }
}
