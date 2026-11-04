package lg;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.ye;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.mb;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.u8;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.is;
import org.telegram.ui.ra1;
import org.telegram.ui.wm;
public final class p0 implements Runnable {
    public final int f18397a = 1;
    public final Object f18398b;
    public final boolean f18399c;
    public final Object d;
    public final Object f18400e;
    public final Object f18401f;
    public final Object h;
    public final TLObject f18402n;

    public p0(File file, ArrayList arrayList, d2 d2Var, wm wmVar, TLRPC.Document document, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.d = file;
        this.f18398b = arrayList;
        this.f18400e = d2Var;
        this.f18401f = wmVar;
        this.h = document;
        this.f18399c = z10;
        this.f18402n = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        TLRPC.Document document;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        boolean z10;
        ArrayList arrayList;
        ?? r82;
        zh.k kVar;
        String a02;
        int i3 = this.f18397a;
        boolean z11 = this.f18399c;
        int i10 = 0;
        Object obj = this.f18398b;
        TLObject tLObject = this.f18402n;
        Object obj2 = this.h;
        Object obj3 = this.f18401f;
        Object obj4 = this.f18400e;
        Object obj5 = this.d;
        switch (i3) {
            case 0:
                r0.Z((r0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3, (int[]) obj2, (ArrayList) obj, this.f18399c, (TLRPC.User) tLObject);
                return;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj;
                d2 d2Var = (d2) obj4;
                TLRPC.Document document2 = (TLRPC.Document) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject;
                arrayList2.add(new ye(0, ((File) obj5).getAbsolutePath(), 0, false, 0, 0));
                PhotoViewer.v1().N2(d2Var.getParentActivity(), null, d2Var.getResourceProvider());
                PhotoViewer.v1().j2(arrayList2, 0, 11, false, new Object(), (wm) obj3);
                PhotoViewer v12 = PhotoViewer.v1();
                if (z11) {
                    document = document2;
                } else {
                    document = null;
                }
                v12.Z0(document2, document, false, null);
                is p10 = is.p();
                if (z11) {
                    tL_messages_stickerSet = tL_messages_stickerSet2;
                } else {
                    tL_messages_stickerSet = null;
                }
                p10.T = tL_messages_stickerSet;
                return;
            case 2:
                ra1.i0((ra1) obj5, (TLRPC.TL_error) obj4, this.f18399c, (TLObject) obj3, (byte[]) obj2, (String) obj, (TL_account.passwordInputSettings) tLObject);
                return;
            default:
                zh.k kVar2 = (zh.k) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) obj2;
                TLRPC.User user = (TLRPC.User) tLObject;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) obj;
                int i11 = kVar2.f60588k;
                ArrayList arrayList3 = kVar2.f60583e;
                d2 d2Var2 = kVar2.f60585g;
                if (d2Var2 != null && d2Var2.getParentActivity() != null) {
                    if (tL_error == null) {
                        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) tLObject2;
                        boolean z12 = true;
                        if (!tL_updates.chats.isEmpty()) {
                            hp.s1(i11).V2(0, tL_updates.chats.get(0).f27001id, true);
                        }
                        int i12 = 0;
                        while (true) {
                            if (i12 < arrayList3.size()) {
                                z10 = z11;
                                if (((TLRPC.TL_chatInviteImporter) arrayList3.get(i12)).user_id == tL_chatInviteImporter.user_id) {
                                    arrayList3.remove(i12);
                                } else {
                                    i12++;
                                    z11 = z10;
                                }
                            } else {
                                z10 = z11;
                            }
                        }
                        zh.f fVar = kVar2.f60584f;
                        zh.k kVar3 = fVar.f60562c;
                        int i13 = 0;
                        while (true) {
                            arrayList = kVar3.f60582c;
                            if (i13 < arrayList.size()) {
                                r82 = z12;
                                kVar = kVar2;
                                if (((TLRPC.TL_chatInviteImporter) arrayList.get(i13)).user_id != tL_chatInviteImporter.user_id) {
                                    i13++;
                                    z12 = r82 == true ? 1 : 0;
                                    kVar2 = kVar;
                                }
                            } else {
                                r82 = z12;
                                kVar = kVar2;
                                i13 = -1;
                            }
                        }
                        if (i13 >= 0) {
                            arrayList.remove(i13);
                            fVar.s(((fVar.f60562c.B ? 1 : 0) ^ r82) + i13);
                            if (arrayList.isEmpty()) {
                                fVar.s(r82);
                            }
                        }
                        zh.k kVar4 = kVar;
                        kVar4.f(kVar4.f60597t, false, r82);
                        if (z10) {
                            mb mbVar = new mb(d2Var2.getParentActivity(), d2Var2.getResourceProvider());
                            int L = org.telegram.messenger.g0.L(15.0f);
                            k9 k9Var = mbVar.f36116a;
                            k9Var.setRoundRadius(L);
                            k9Var.e(user, new u8(0, user));
                            String j10 = l10.j(user, true);
                            if (kVar4.f60580a) {
                                a02 = bd.a0("HasBeenAddedToChannel", null, 2131749372, j10);
                            } else {
                                a02 = bd.a0("HasBeenAddedToGroup", null, 2131749371, j10);
                            }
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a02);
                            int indexOf = a02.indexOf(j10);
                            spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o()), indexOf, j10.length() + indexOf, 18);
                            mbVar.f36117b.setText(spannableStringBuilder);
                            if (arrayList3.isEmpty()) {
                                ac.g(d2Var2, mbVar, 2750).j();
                            } else {
                                ac.f(kVar4.h, mbVar, 2750).j();
                            }
                        }
                        org.telegram.ui.ActionBar.x q10 = d2Var2.getActionBar().q();
                        if (TextUtils.isEmpty(kVar4.f60597t) && kVar4.f60589l) {
                            org.telegram.ui.ActionBar.q0 j11 = q10.j(0);
                            if (arrayList3.isEmpty()) {
                                i10 = 8;
                            }
                            j11.setVisibility(i10);
                            return;
                        }
                        return;
                    }
                    t4.e0(i11, tL_error, d2Var2, tL_messages_hideChatJoinRequest, new Object[0]);
                    return;
                }
                return;
        }
    }

    public p0(r0 r0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.d = r0Var;
        this.f18400e = tL_error;
        this.f18401f = tLObject;
        this.h = iArr;
        this.f18398b = arrayList;
        this.f18399c = z10;
        this.f18402n = user;
    }

    public p0(ra1 ra1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.d = ra1Var;
        this.f18400e = tL_error;
        this.f18399c = z10;
        this.f18401f = tLObject;
        this.h = bArr;
        this.f18398b = str;
        this.f18402n = passwordinputsettings;
    }

    public p0(zh.k kVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.d = kVar;
        this.f18400e = tL_error;
        this.f18401f = tLObject;
        this.h = tL_chatInviteImporter;
        this.f18399c = z10;
        this.f18402n = user;
        this.f18398b = tL_messages_hideChatJoinRequest;
    }
}
