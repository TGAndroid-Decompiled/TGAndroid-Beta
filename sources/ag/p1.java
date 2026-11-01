package ag;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.dd;
import org.telegram.messenger.ff;
import org.telegram.messenger.i20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.ib;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.y41;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.kt;
import org.telegram.ui.rc1;
import org.telegram.ui.un;
public final class p1 implements Runnable {
    public final int f671a = 0;
    public final Object f672b;
    public final Object f673c;
    public final boolean d;
    public final TLObject e;
    public final Object f674f;
    public final Object h;
    public final Object f675n;

    public p1(t1 t1Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f674f = t1Var;
        this.f672b = tL_error;
        this.f673c = tLObject;
        this.h = iArr;
        this.f675n = arrayList;
        this.d = z10;
        this.e = user;
    }

    @Override
    public final void run() {
        boolean z10;
        ArrayList arrayList;
        TLRPC.User user;
        int i10;
        String a02;
        TLRPC.Document document;
        int i11 = this.f671a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        boolean z11 = this.d;
        TLObject tLObject = this.e;
        Object obj = this.f675n;
        Object obj2 = this.h;
        Object obj3 = this.f673c;
        Object obj4 = this.f672b;
        Object obj5 = this.f674f;
        switch (i11) {
            case 0:
                t1.Z((t1) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3, (int[]) obj2, (ArrayList) obj, this.d, (TLRPC.User) tLObject);
                return;
            case 1:
                oh.q qVar = (oh.q) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) obj2;
                TLRPC.User user2 = (TLRPC.User) tLObject;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) obj;
                int i12 = qVar.f14300k;
                ArrayList arrayList2 = qVar.e;
                org.telegram.ui.ActionBar.k2 k2Var = qVar.f14297g;
                if (k2Var != null && k2Var.getParentActivity() != null) {
                    if (tL_error == null) {
                        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) tLObject2;
                        if (!tL_updates.chats.isEmpty()) {
                            wp.r1(i12).T2(0, tL_updates.chats.get(0).f19794id, true);
                        }
                        int i13 = 0;
                        while (true) {
                            if (i13 < arrayList2.size()) {
                                z10 = z11;
                                if (((TLRPC.TL_chatInviteImporter) arrayList2.get(i13)).user_id == tL_chatInviteImporter.user_id) {
                                    arrayList2.remove(i13);
                                } else {
                                    i13++;
                                    z11 = z10;
                                }
                            } else {
                                z10 = z11;
                            }
                        }
                        oh.j jVar = qVar.f14296f;
                        oh.q qVar2 = jVar.f14269c;
                        int i14 = 0;
                        while (true) {
                            arrayList = qVar2.f14295c;
                            if (i14 < arrayList.size()) {
                                user = user2;
                                if (((TLRPC.TL_chatInviteImporter) arrayList.get(i14)).user_id != tL_chatInviteImporter.user_id) {
                                    i14++;
                                    user2 = user;
                                }
                            } else {
                                user = user2;
                                i14 = -1;
                            }
                        }
                        if (i14 >= 0) {
                            arrayList.remove(i14);
                            jVar.s((!jVar.f14269c.B ? 1 : 0) + i14);
                            if (arrayList.isEmpty()) {
                                jVar.s(1);
                            }
                        }
                        qVar.f(qVar.f14309t, false, true);
                        if (z10) {
                            ib ibVar = new ib(k2Var.getParentActivity(), k2Var.getResourceProvider());
                            int L = org.telegram.messenger.i0.L(15.0f);
                            g9 g9Var = ibVar.f27062a;
                            g9Var.setRoundRadius(L);
                            g9Var.e(user, new r8(0, user));
                            String j10 = i20.j(user, true);
                            if (qVar.f14293a) {
                                a02 = dd.a0("HasBeenAddedToChannel", null, 2131749373, j10);
                            } else {
                                a02 = dd.a0("HasBeenAddedToGroup", null, 2131749372, j10);
                            }
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a02);
                            int indexOf = a02.indexOf(j10);
                            spannableStringBuilder.setSpan(new y41(org.telegram.messenger.i0.o()), indexOf, j10.length() + indexOf, 18);
                            ibVar.f27063b.setText(spannableStringBuilder);
                            if (arrayList2.isEmpty()) {
                                wb.g(k2Var, ibVar, 2750).j();
                            } else {
                                wb.f(qVar.h, ibVar, 2750).j();
                            }
                        }
                        org.telegram.ui.ActionBar.y p5 = k2Var.getActionBar().p();
                        if (TextUtils.isEmpty(qVar.f14309t) && qVar.f14301l) {
                            org.telegram.ui.ActionBar.t0 j11 = p5.j(0);
                            if (arrayList2.isEmpty()) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            j11.setVisibility(i10);
                            return;
                        }
                        return;
                    }
                    s4.e0(i12, tL_error, k2Var, tL_messages_hideChatJoinRequest, new Object[0]);
                    return;
                }
                return;
            case 2:
                ArrayList arrayList3 = (ArrayList) obj;
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) obj4;
                TLRPC.Document document2 = (TLRPC.Document) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject;
                arrayList3.add(new ff(0, ((File) obj5).getAbsolutePath(), 0, false, 0, 0));
                PhotoViewer.v1().N2(k2Var2.getParentActivity(), null, k2Var2.getResourceProvider());
                PhotoViewer.v1().j2(arrayList3, 0, 11, false, new Object(), (un) obj3);
                PhotoViewer v12 = PhotoViewer.v1();
                if (z11) {
                    document = document2;
                } else {
                    document = null;
                }
                v12.Z0(document2, document, false, null);
                kt p9 = kt.p();
                if (z11) {
                    tL_messages_stickerSet = tL_messages_stickerSet2;
                }
                p9.T = tL_messages_stickerSet;
                return;
            default:
                rc1.i0((rc1) obj5, (TLRPC.TL_error) obj4, this.d, (TLObject) obj3, (byte[]) obj2, (String) obj, (TL_account.passwordInputSettings) tLObject);
                return;
        }
    }

    public p1(File file, ArrayList arrayList, org.telegram.ui.ActionBar.k2 k2Var, un unVar, TLRPC.Document document, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.f674f = file;
        this.f675n = arrayList;
        this.f672b = k2Var;
        this.f673c = unVar;
        this.h = document;
        this.d = z10;
        this.e = tL_messages_stickerSet;
    }

    public p1(oh.q qVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f674f = qVar;
        this.f672b = tL_error;
        this.f673c = tLObject;
        this.h = tL_chatInviteImporter;
        this.d = z10;
        this.e = user;
        this.f675n = tL_messages_hideChatJoinRequest;
    }

    public p1(rc1 rc1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f674f = rc1Var;
        this.f672b = tL_error;
        this.d = z10;
        this.f673c = tLObject;
        this.h = bArr;
        this.f675n = str;
        this.e = passwordinputsettings;
    }
}
