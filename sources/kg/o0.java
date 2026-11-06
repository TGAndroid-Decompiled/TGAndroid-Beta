package kg;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.gf;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.w8;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.an;
import org.telegram.ui.ks;
import org.telegram.ui.ya1;
public final class o0 implements Runnable {
    public final int f17457a = 1;
    public final Object f17458b;
    public final boolean f17459c;
    public final Object d;
    public final Object f17460e;
    public final Object f17461f;
    public final Object h;
    public final TLObject f17462n;

    public o0(File file, ArrayList arrayList, f2 f2Var, an anVar, TLRPC.Document document, boolean z9, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.d = file;
        this.f17458b = arrayList;
        this.f17460e = f2Var;
        this.f17461f = anVar;
        this.h = document;
        this.f17459c = z9;
        this.f17462n = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        TLRPC.Document document;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        boolean z9;
        ArrayList arrayList;
        ?? r82;
        yh.m mVar;
        String a02;
        int i7 = this.f17457a;
        boolean z10 = this.f17459c;
        int i10 = 0;
        Object obj = this.f17458b;
        TLObject tLObject = this.f17462n;
        Object obj2 = this.h;
        Object obj3 = this.f17461f;
        Object obj4 = this.f17460e;
        Object obj5 = this.d;
        switch (i7) {
            case 0:
                q0.Z((q0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3, (int[]) obj2, (ArrayList) obj, this.f17459c, (TLRPC.User) tLObject);
                return;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj;
                f2 f2Var = (f2) obj4;
                TLRPC.Document document2 = (TLRPC.Document) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject;
                arrayList2.add(new gf(0, ((File) obj5).getAbsolutePath(), 0, false, 0, 0));
                PhotoViewer.p1().H2(f2Var.getParentActivity(), null, f2Var.getResourceProvider());
                PhotoViewer.p1().e2(arrayList2, 0, 11, false, new Object(), (an) obj3);
                PhotoViewer p12 = PhotoViewer.p1();
                if (z10) {
                    document = document2;
                } else {
                    document = null;
                }
                p12.S0(document2, document, false, null);
                ks p10 = ks.p();
                if (z10) {
                    tL_messages_stickerSet = tL_messages_stickerSet2;
                } else {
                    tL_messages_stickerSet = null;
                }
                p10.T = tL_messages_stickerSet;
                return;
            case 2:
                ya1.i0((ya1) obj5, (TLRPC.TL_error) obj4, this.f17459c, (TLObject) obj3, (byte[]) obj2, (String) obj, (TL_account.passwordInputSettings) tLObject);
                return;
            default:
                yh.m mVar2 = (yh.m) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) obj2;
                TLRPC.User user = (TLRPC.User) tLObject;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) obj;
                int i11 = mVar2.f59428k;
                ArrayList arrayList3 = mVar2.f59423e;
                f2 f2Var2 = mVar2.f59425g;
                if (f2Var2 != null && f2Var2.getParentActivity() != null) {
                    if (tL_error == null) {
                        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) tLObject2;
                        boolean z11 = true;
                        if (!tL_updates.chats.isEmpty()) {
                            qp.s1(i11).V2(0, tL_updates.chats.get(0).f26952id, true);
                        }
                        int i12 = 0;
                        while (true) {
                            if (i12 < arrayList3.size()) {
                                z9 = z10;
                                if (((TLRPC.TL_chatInviteImporter) arrayList3.get(i12)).user_id == tL_chatInviteImporter.user_id) {
                                    arrayList3.remove(i12);
                                } else {
                                    i12++;
                                    z10 = z9;
                                }
                            } else {
                                z9 = z10;
                            }
                        }
                        yh.h hVar = mVar2.f59424f;
                        yh.m mVar3 = hVar.f59402c;
                        int i13 = 0;
                        while (true) {
                            arrayList = mVar3.f59422c;
                            if (i13 < arrayList.size()) {
                                r82 = z11;
                                mVar = mVar2;
                                if (((TLRPC.TL_chatInviteImporter) arrayList.get(i13)).user_id != tL_chatInviteImporter.user_id) {
                                    i13++;
                                    z11 = r82 == true ? 1 : 0;
                                    mVar2 = mVar;
                                }
                            } else {
                                r82 = z11;
                                mVar = mVar2;
                                i13 = -1;
                            }
                        }
                        if (i13 >= 0) {
                            arrayList.remove(i13);
                            hVar.s(((hVar.f59402c.B ? 1 : 0) ^ r82) + i13);
                            if (arrayList.isEmpty()) {
                                hVar.s(r82);
                            }
                        }
                        yh.m mVar4 = mVar;
                        mVar4.f(mVar4.f59437t, false, r82);
                        if (z9) {
                            ob obVar = new ob(f2Var2.getParentActivity(), f2Var2.getResourceProvider());
                            int L = org.telegram.messenger.g0.L(15.0f);
                            l9 l9Var = obVar.f36691a;
                            l9Var.setRoundRadius(L);
                            l9Var.e(user, new w8(0, user));
                            String j3 = t10.j(user, true);
                            if (mVar4.f59420a) {
                                a02 = hd.a0("HasBeenAddedToChannel", null, 2131749363, j3);
                            } else {
                                a02 = hd.a0("HasBeenAddedToGroup", null, 2131749362, j3);
                            }
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a02);
                            int indexOf = a02.indexOf(j3);
                            spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o()), indexOf, j3.length() + indexOf, 18);
                            obVar.f36692b.setText(spannableStringBuilder);
                            if (arrayList3.isEmpty()) {
                                cc.g(f2Var2, obVar, 2750).j();
                            } else {
                                cc.f(mVar4.h, obVar, 2750).j();
                            }
                        }
                        org.telegram.ui.ActionBar.y q10 = f2Var2.getActionBar().q();
                        if (TextUtils.isEmpty(mVar4.f59437t) && mVar4.f59429l) {
                            org.telegram.ui.ActionBar.r0 j10 = q10.j(0);
                            if (arrayList3.isEmpty()) {
                                i10 = 8;
                            }
                            j10.setVisibility(i10);
                            return;
                        }
                        return;
                    }
                    v4.c0(i11, tL_error, f2Var2, tL_messages_hideChatJoinRequest, new Object[0]);
                    return;
                }
                return;
        }
    }

    public o0(q0 q0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z9, TLRPC.User user) {
        this.d = q0Var;
        this.f17460e = tL_error;
        this.f17461f = tLObject;
        this.h = iArr;
        this.f17458b = arrayList;
        this.f17459c = z9;
        this.f17462n = user;
    }

    public o0(ya1 ya1Var, TLRPC.TL_error tL_error, boolean z9, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.d = ya1Var;
        this.f17460e = tL_error;
        this.f17459c = z9;
        this.f17461f = tLObject;
        this.h = bArr;
        this.f17458b = str;
        this.f17462n = passwordinputsettings;
    }

    public o0(yh.m mVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z9, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.d = mVar;
        this.f17460e = tL_error;
        this.f17461f = tLObject;
        this.h = tL_chatInviteImporter;
        this.f17459c = z9;
        this.f17462n = user;
        this.f17458b = tL_messages_hideChatJoinRequest;
    }
}
