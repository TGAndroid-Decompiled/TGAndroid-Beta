package kg;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ff;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.y31;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.an;
import org.telegram.ui.ns;
import org.telegram.ui.xa1;
public final class o0 implements Runnable {
    public final int f18016a = 1;
    public final Object f18017b;
    public final boolean f18018c;
    public final Object d;
    public final Object f18019e;
    public final Object f18020f;
    public final Object h;
    public final TLObject f18021n;

    public o0(File file, ArrayList arrayList, e2 e2Var, an anVar, TLRPC.Document document, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.d = file;
        this.f18017b = arrayList;
        this.f18019e = e2Var;
        this.f18020f = anVar;
        this.h = document;
        this.f18018c = z10;
        this.f18021n = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        TLRPC.Document document;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        boolean z10;
        ArrayList arrayList;
        ?? r82;
        zh.l lVar;
        String a02;
        int i7 = this.f18016a;
        boolean z11 = this.f18018c;
        int i10 = 0;
        Object obj = this.f18017b;
        TLObject tLObject = this.f18021n;
        Object obj2 = this.h;
        Object obj3 = this.f18020f;
        Object obj4 = this.f18019e;
        Object obj5 = this.d;
        switch (i7) {
            case 0:
                q0.Z((q0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3, (int[]) obj2, (ArrayList) obj, this.f18018c, (TLRPC.User) tLObject);
                return;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj;
                e2 e2Var = (e2) obj4;
                TLRPC.Document document2 = (TLRPC.Document) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject;
                arrayList2.add(new ff(0, ((File) obj5).getAbsolutePath(), 0, false, 0, 0));
                PhotoViewer.p1().I2(e2Var.getParentActivity(), null, e2Var.getResourceProvider());
                PhotoViewer.p1().f2(arrayList2, 0, 11, false, new Object(), (an) obj3);
                PhotoViewer p12 = PhotoViewer.p1();
                if (z11) {
                    document = document2;
                } else {
                    document = null;
                }
                p12.S0(document2, document, false, null);
                ns p10 = ns.p();
                if (z11) {
                    tL_messages_stickerSet = tL_messages_stickerSet2;
                } else {
                    tL_messages_stickerSet = null;
                }
                p10.T = tL_messages_stickerSet;
                return;
            case 2:
                xa1.i0((xa1) obj5, (TLRPC.TL_error) obj4, this.f18018c, (TLObject) obj3, (byte[]) obj2, (String) obj, (TL_account.passwordInputSettings) tLObject);
                return;
            default:
                zh.l lVar2 = (zh.l) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) obj2;
                TLRPC.User user = (TLRPC.User) tLObject;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) obj;
                int i11 = lVar2.f61450k;
                ArrayList arrayList3 = lVar2.f61445e;
                e2 e2Var2 = lVar2.f61447g;
                if (e2Var2 != null && e2Var2.getParentActivity() != null) {
                    if (tL_error == null) {
                        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) tLObject2;
                        boolean z12 = true;
                        if (!tL_updates.chats.isEmpty()) {
                            np.s1(i11).V2(0, tL_updates.chats.get(0).f28051id, true);
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
                        zh.g gVar = lVar2.f61446f;
                        zh.l lVar3 = gVar.f61424c;
                        int i13 = 0;
                        while (true) {
                            arrayList = lVar3.f61444c;
                            if (i13 < arrayList.size()) {
                                r82 = z12;
                                lVar = lVar2;
                                if (((TLRPC.TL_chatInviteImporter) arrayList.get(i13)).user_id != tL_chatInviteImporter.user_id) {
                                    i13++;
                                    z12 = r82 == true ? 1 : 0;
                                    lVar2 = lVar;
                                }
                            } else {
                                r82 = z12;
                                lVar = lVar2;
                                i13 = -1;
                            }
                        }
                        if (i13 >= 0) {
                            arrayList.remove(i13);
                            gVar.s(((gVar.f61424c.B ? 1 : 0) ^ r82) + i13);
                            if (arrayList.isEmpty()) {
                                gVar.s(r82);
                            }
                        }
                        zh.l lVar4 = lVar;
                        lVar4.f(lVar4.f61459t, false, r82);
                        if (z10) {
                            jb jbVar = new jb(e2Var2.getParentActivity(), e2Var2.getResourceProvider());
                            int L = org.telegram.messenger.g0.L(15.0f);
                            i9 i9Var = jbVar.f35949a;
                            i9Var.setRoundRadius(L);
                            i9Var.f(user, new t8(0, user));
                            String j3 = q10.j(user, true);
                            if (lVar4.f61442a) {
                                a02 = hd.a0("HasBeenAddedToChannel", null, 2131749364, j3);
                            } else {
                                a02 = hd.a0("HasBeenAddedToGroup", null, 2131749363, j3);
                            }
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a02);
                            int indexOf = a02.indexOf(j3);
                            spannableStringBuilder.setSpan(new y31(org.telegram.messenger.g0.o()), indexOf, j3.length() + indexOf, 18);
                            jbVar.f35950b.setText(spannableStringBuilder);
                            if (arrayList3.isEmpty()) {
                                xb.g(e2Var2, jbVar, 2750).j();
                            } else {
                                xb.f(lVar4.h, jbVar, 2750).j();
                            }
                        }
                        org.telegram.ui.ActionBar.y s5 = e2Var2.getActionBar().s();
                        if (TextUtils.isEmpty(lVar4.f61459t) && lVar4.f61451l) {
                            org.telegram.ui.ActionBar.q0 j10 = s5.j(0);
                            if (arrayList3.isEmpty()) {
                                i10 = 8;
                            }
                            j10.setVisibility(i10);
                            return;
                        }
                        return;
                    }
                    t4.c0(i11, tL_error, e2Var2, tL_messages_hideChatJoinRequest, new Object[0]);
                    return;
                }
                return;
        }
    }

    public o0(q0 q0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.d = q0Var;
        this.f18019e = tL_error;
        this.f18020f = tLObject;
        this.h = iArr;
        this.f18017b = arrayList;
        this.f18018c = z10;
        this.f18021n = user;
    }

    public o0(xa1 xa1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.d = xa1Var;
        this.f18019e = tL_error;
        this.f18018c = z10;
        this.f18020f = tLObject;
        this.h = bArr;
        this.f18017b = str;
        this.f18021n = passwordinputsettings;
    }

    public o0(zh.l lVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.d = lVar;
        this.f18019e = tL_error;
        this.f18020f = tLObject;
        this.h = tL_chatInviteImporter;
        this.f18018c = z10;
        this.f18021n = user;
        this.f18017b = tL_messages_hideChatJoinRequest;
    }
}
