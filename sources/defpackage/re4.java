package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;
public final class re4 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public re4(c cVar, WalletEngine2.ImportedWalletProof importedWalletProof, Exception exc, icc iccVar) {
        this.a = (byte) 13;
        this.d = importedWalletProof;
        this.b = exc;
        this.c = iccVar;
    }

    @Override
    public final void run() {
        int i;
        int i2;
        int[] iArr;
        File file;
        int i3;
        String str;
        boolean z;
        wxc wxcVar;
        byte b = this.a;
        Bitmap bitmap = null;
        byte[] bArr = null;
        r9 = null;
        r9 = null;
        r9 = null;
        int[] iArr2 = null;
        Bitmap decodeFile = null;
        Pair pair = null;
        bitmap = null;
        int i4 = 0;
        r10 = false;
        boolean z2 = false;
        r10 = false;
        r10 = false;
        boolean z3 = false;
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                ?? r0 = (nf4) obj3;
                TLObject tLObject = (TLObject) obj;
                r0.getClass();
                nf4.x0((TLRPC.TL_error) obj2, r0, d31.b0(r0));
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    uc7.e1().edit().putBoolean("n_0", true).apply();
                    r0.getMessagesController().k3(true, null);
                    TL_chatlists.TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite = (TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject;
                    je4 je4Var = new je4(r0.r, tL_chatlists_exportedChatlistInvite.invite);
                    je4Var.y = new ne4(r0, (byte) 3);
                    je4Var.x = new ne4(r0, (byte) 4);
                    r0.presentFragment(je4Var);
                    hl.d3(new se4(r0, tL_chatlists_exportedChatlistInvite, (byte) 0), 200L);
                    return;
                }
                return;
            case 1:
                af4 af4Var = (af4) obj3;
                TLObject tLObject2 = (TLObject) obj;
                e eVar = af4Var.r1;
                nf4.x0((TLRPC.TL_error) obj2, eVar, new d31(af4Var.V1, null));
                if (tLObject2 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    uc7.e1().edit().putBoolean("n_0", true).apply();
                    af4Var.dismiss();
                    eVar.getMessagesController().k3(true, null);
                    eVar.presentFragment(new je4(af4Var.T1, ((TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject2).invite));
                    return;
                }
                return;
            case 2:
                hf4 hf4Var = (hf4) obj3;
                ff4 ff4Var = (ff4) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    d31.b0(hf4Var.a).t(ob6.M0(2131743534, null), null).j();
                    hl.r(ff4Var);
                    return;
                }
                return;
            case 3:
                rf4 rf4Var = (rf4) obj3;
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                uf4 uf4Var = rf4Var.K;
                int[] iArr3 = uf4Var.U0;
                if (iArr3 != null) {
                    i = iArr3[(!uf4Var.g1 ? 1 : 0) == true ? 1 : 0];
                } else {
                    i = 0;
                }
                GLES20.glBindFramebuffer(36160, i);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, uf4Var.g(!rf4Var.U ? 1 : 0), 0);
                GLES20.glClear(0);
                int i5 = rf4Var.V;
                if (i5 != 0 && (i2 = rf4Var.W) != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect((i5 * i2) << 2);
                    GLES20.glReadPixels(0, 0, rf4Var.V, rf4Var.W, 6408, 5121, allocateDirect);
                    bitmap = Bitmap.createBitmap(rf4Var.V, rf4Var.W, Bitmap.Config.ARGB_8888);
                    bitmap.copyPixelsFromBuffer(allocateDirect);
                }
                bitmapArr[0] = bitmap;
                countDownLatch.countDown();
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glClear(0);
                return;
            case 4:
                id idVar = (id) obj2;
                ac7 ac7Var = (ac7) obj;
                FiltersSetupActivity filtersSetupActivity = ((ih4) obj3).e;
                if (idVar != null) {
                    try {
                        idVar.dismiss();
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                }
                filtersSetupActivity.getMessagesController().s4(ac7Var);
                jf7 messagesStorage = filtersSetupActivity.getMessagesStorage();
                messagesStorage.a.c(new t87(messagesStorage, ac7Var, (byte) 20));
                return;
            case 5:
                qn4 qn4Var = (qn4) obj3;
                qn4Var.u2 = -1;
                v21 I = d31.b0((e) obj2).I(2131624052, ob6.a0(null, null, 2131750623, qn4Var.X1), ob6.G(((ArrayList) obj).size(), "FolderLinkDeletedSubtitle", new Object[0]));
                I.j = 5000;
                I.j();
                qn4Var.v2 = true;
                qn4Var.dismiss();
                qn4Var.r1.getMessagesController().i2(qn4Var.T1);
                return;
            case 6:
                qn4 qn4Var2 = (qn4) obj3;
                qn4Var2.u2 = qn4Var2.r1.getConnectionsManager().sendRequest((TLObject) obj, new mw3(qn4Var2, (Pair) obj2, (byte) 6));
                return;
            case 7:
                st4 st4Var = (st4) obj3;
                String str2 = (String) obj;
                float f = st4Var.L;
                if (obj2 != null) {
                    int min = (int) Math.min(hl.q.x / 3.0f, hl.L(330.0f));
                    if (obj2 instanceof no6) {
                        no6 no6Var = (no6) obj2;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        st4Var.c(no6Var, options);
                        c8b.B(options, min);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        Bitmap c = st4Var.c(no6Var, options);
                        if (c != null && c.getHeight() / c.getWidth() < f) {
                            if (no6Var.T == 0 && no6Var.U == 0 && !c.isRecycled()) {
                                iArr2 = bje.b(c, true);
                                no6Var.T = iArr2[0];
                                no6Var.U = iArr2[1];
                            } else {
                                int i6 = no6Var.T;
                                if (i6 != 0 && (i3 = no6Var.U) != 0) {
                                    iArr2 = new int[]{i6, i3};
                                }
                            }
                        }
                        iArr = iArr2;
                        decodeFile = c;
                    } else if ((obj2 instanceof c8b) && (file = ((c8b) obj2).O0) != null) {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file.getPath(), options2);
                        c8b.B(options2, min);
                        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options2.inDither = true;
                        options2.inJustDecodeBounds = false;
                        decodeFile = BitmapFactory.decodeFile(file.getPath(), options2);
                        iArr = null;
                    } else {
                        iArr = null;
                    }
                    pair = new Pair(decodeFile, iArr);
                }
                hl.c3(new re4(st4Var, str2, pair, (byte) 8));
                return;
            case 8:
                st4 st4Var2 = (st4) obj3;
                String str3 = (String) obj2;
                Pair pair2 = (Pair) obj;
                Bitmap bitmap2 = (Bitmap) pair2.first;
                int[] iArr4 = (int[]) pair2.second;
                if (bitmap2 != null) {
                    if (str3 != null) {
                        st4.g0.put(str3, bitmap2);
                        HashMap hashMap = st4.f0;
                        Integer num = (Integer) hashMap.get(str3);
                        if (num != null) {
                            hashMap.put(str3, Integer.valueOf(num.intValue() + 1));
                        } else {
                            hashMap.put(str3, 1);
                        }
                    }
                    if (!TextUtils.equals(str3, st4Var2.S)) {
                        st4.d(str3);
                        return;
                    }
                    st4Var2.a = bitmap2;
                    ?? r1 = st4Var2.d;
                    if (iArr4 == null) {
                        r1.setShader(null);
                        st4Var2.e = null;
                    } else {
                        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr4, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                        st4Var2.e = linearGradient;
                        r1.setShader(linearGradient);
                    }
                    st4Var2.h();
                    st4Var2.invalidate();
                    return;
                }
                return;
            case 9:
                vt4 vt4Var = (vt4) obj3;
                TLObject tLObject3 = (TLObject) obj;
                uc7 uc7Var = (uc7) obj2;
                vt4Var.r = true;
                vt4Var.d = false;
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    uc7Var.j4(tL_contacts_resolvedPeer.users, false);
                    uc7Var.c4(tL_contacts_resolvedPeer.chats, false);
                    jf7.Y(vt4Var.x.a).j1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                    vt4Var.E();
                    return;
                }
                return;
            case 10:
                bx4 bx4Var = (bx4) obj3;
                TLObject tLObject4 = (TLObject) obj;
                if (TextUtils.equals(bx4Var.k2, (String) obj2)) {
                    bx4Var.l2 = -1;
                    bx4Var.f2.clear();
                    bx4Var.g2.clear();
                    if (tLObject4 instanceof TLRPC.TL_contacts_found) {
                        TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject4;
                        uc7 s1 = uc7.s1(bx4Var.a);
                        s1.j4(tL_contacts_found.users, false);
                        s1.c4(tL_contacts_found.chats, false);
                        HashSet hashSet = new HashSet();
                        bx4Var.Z0(tL_contacts_found.my_results, hashSet);
                        bx4Var.Z0(tL_contacts_found.results, hashSet);
                    }
                    bx4Var.i2.O(true);
                    return;
                }
                return;
            case 11:
                yx4 yx4Var = (yx4) obj3;
                qc9 qc9Var = (qc9) obj2;
                fu5 fu5Var = (fu5) obj;
                ez4 ez4Var = yx4Var.D2;
                if (ez4Var == null) {
                    yx4Var.R();
                    ez4Var = new ez4(yx4Var.Z0, dtd.l(yx4Var.J0), yx4Var.J0, hl.L(6.0f));
                    yx4Var.D2 = ez4Var;
                }
                if (!ez4Var.e(qc9Var, qc9Var.getContent(), false, yx4Var.R(), fu5Var)) {
                    fu5Var.a0();
                    return;
                }
                return;
            case 12:
                c cVar = (c) obj3;
                v25 v25Var = (v25) obj;
                if (cVar.Q.get((String) obj2) == v25Var) {
                    v25Var.e = true;
                    ArrayList arrayList = v25Var.f;
                    cVar.y0(v25Var);
                    int size = arrayList.size();
                    while (i4 < size) {
                        Object obj4 = arrayList.get(i4);
                        i4++;
                        ((pcc) obj4).a(v25Var);
                    }
                    arrayList.clear();
                    cVar.T();
                    return;
                }
                return;
            case 13:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj3;
                Exception exc = (Exception) obj2;
                icc iccVar = (icc) obj;
                if (importedWalletProof == null) {
                    StringBuilder sb = new StringBuilder("failed to prove: ");
                    String str4 = "PROOF_ERROR";
                    if (exc == null || exc.getMessage() == null) {
                        str = "PROOF_ERROR";
                    } else {
                        str = exc.getMessage();
                    }
                    sb.append(str);
                    c.n(sb.toString(), exc);
                    if (exc != null && exc.getMessage() != null) {
                        str4 = exc.getMessage();
                    }
                    iccVar.a(null, str4);
                    return;
                }
                c.P("proof done");
                iccVar.a(importedWalletProof, null);
                return;
            case 14:
                ((v45) obj3).f = false;
                ((zj3) obj2).a((String) obj);
                return;
            case 15:
                a55 a55Var = (a55) obj3;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj2;
                a55Var.getClass();
                m62 m62Var = new m62((pcc) obj, (byte) 2);
                if (tonconnectsession != null && tonconnectsession.dapp_client_id != null && tonconnectsession.client_id != null && tonconnectsession.nonce != null) {
                    if (!a55Var.c.add(Long.valueOf(tonconnectsession.id))) {
                        m62Var.a("A TON Connect operation is already in progress");
                        return;
                    }
                    gt gtVar = new gt(a55Var, tonconnectsession, m62Var, (byte) 20);
                    if (tonconnectsession.closed) {
                        gtVar.a(null);
                        return;
                    } else {
                        a55Var.b.A0(new re4(a55Var, gtVar, tonconnectsession, (byte) 18));
                        return;
                    }
                }
                m62Var.a("Missing TON Connect session data");
                return;
            case 16:
                ((qe2) obj3).a((TL_wallet.inputTonConnectOauthSession) obj2, (String) obj);
                return;
            case 17:
                w45 w45Var = (w45) obj2;
                c51 c51Var = (c51) obj;
                if (!((ti3) obj3).canScrollVertically(1)) {
                    w45Var.p = true;
                }
                if (w45Var.p && !w45Var.m && !w45Var.n) {
                    z3 = true;
                }
                c51Var.setEnabled(z3);
                return;
            case 18:
                a55 a55Var2 = (a55) obj3;
                gt gtVar2 = (gt) obj2;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                c cVar2 = a55Var2.b;
                String x = cVar2.x();
                byte[] D = cVar2.D();
                if (D != null) {
                    bArr = (byte[]) D.clone();
                }
                byte[] bArr2 = bArr;
                if (x != null && bArr2 != null) {
                    cVar2.E(true, false, false, new pm1(a55Var2, gtVar2, tonconnectsession2, x, bArr2, (byte) 5));
                    return;
                } else {
                    gtVar2.a("Wallet is not ready");
                    return;
                }
            case 19:
                a55 a55Var3 = (a55) obj3;
                v45 v45Var = (v45) obj2;
                a55Var3.getClass();
                zj3 zj3Var = new zj3((o45) obj, (byte) 14);
                TL_wallet.tonConnectSession tonconnectsession3 = v45Var.e;
                if (!tonconnectsession3.closed && !tonconnectsession3.closing && tonconnectsession3.manifest_error == null && tonconnectsession3.manifest != null) {
                    if (v45Var.f) {
                        zj3Var.a("A TON Connect operation is already in progress");
                        return;
                    }
                    v45Var.f = true;
                    a55Var3.b.A0(new ao1(a55Var3, v45Var, zj3Var, tonconnectsession3, (byte) 28));
                    return;
                }
                zj3Var.a("The dApp manifest is unavailable or the session is closed");
                return;
            case 20:
                boolean[] zArr = (boolean[]) obj2;
                l55 l55Var = (l55) obj;
                o55.a.remove((st) obj3);
                if (!zArr[0]) {
                    zArr[0] = true;
                    d31.c0(ob6.M0(2131742590, null));
                    l55Var.a();
                    return;
                }
                return;
            case 21:
                n55 n55Var = (n55) obj3;
                c51 c51Var2 = (c51) obj2;
                c51 c51Var3 = (c51) obj;
                boolean a = n55Var.a();
                if (!a && !n55Var.d) {
                    z = true;
                } else {
                    z = false;
                }
                c51Var2.setEnabled(z);
                if (!a && !n55Var.d) {
                    z2 = true;
                }
                c51Var3.setEnabled(z2);
                return;
            case 22:
                r55 r55Var = (r55) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject5 = (TLObject) obj;
                if (tL_error != null) {
                    r55Var.a.b(false);
                    d31.e0(tL_error);
                    return;
                } else if (tLObject5 instanceof TLRPC.TL_boolFalse) {
                    r55Var.a.b(false);
                    xnb.x(null, 2131743534, d31.b0(r55Var), null);
                    return;
                } else {
                    r55Var.finishFragment();
                    return;
                }
            case 23:
                mb5 mb5Var = (mb5) obj3;
                ka5 ka5Var = (ka5) obj2;
                ka5 ka5Var2 = (ka5) obj;
                ValueAnimator valueAnimator = mb5Var.O0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                ka5Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new kb5(mb5Var, ka5Var, (byte) 3)).setDuration(100L).start();
                if (ka5Var2 != null) {
                    ka5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).setListener(new ia5(ka5Var2, (byte) 3)).start();
                    return;
                }
                return;
            case 24:
                pc5 pc5Var = (pc5) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                rc5 rc5Var = pc5Var.J;
                sv9 sv9Var = pc5Var.f;
                if (pc5Var.n) {
                    pc5Var.h = null;
                    pc5Var.d = arrayList2;
                    pc5Var.e = arrayList3;
                    sv9Var.f(arrayList2, null);
                    rc5Var.t0(pc5Var.I);
                    pc5Var.f();
                    if (pc5Var.n && !sv9Var.e() && pc5Var.b() == 0) {
                        rc5Var.s.e(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                cm0 cm0Var = (cm0) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                String str5 = (String) obj;
                ArrayList arrayList5 = new ArrayList();
                for (int i7 = 0; i7 < arrayList4.size(); i7++) {
                    n01 n01Var = (n01) arrayList4.get(i7);
                    if (cm0.n(n01Var.c, str5) || ((wxcVar = n01Var.d) != null && (cm0.n(wxcVar.c, str5) || cm0.n(n01Var.d.d, str5)))) {
                        arrayList5.add(n01Var);
                    }
                }
                hl.c3(new se4(cm0Var, arrayList5, (byte) 29));
                return;
            case 26:
                String str6 = (String) obj2;
                hb4 hb4Var = (hb4) obj;
                in5 in5Var = ((sm5) obj3).b;
                HashMap hashMap2 = in5Var.h;
                ?? r2 = in5Var.i;
                wm5 wm5Var = (wm5) hashMap2.remove(str6);
                if (wm5Var != null) {
                    ArrayList arrayList6 = wm5Var.v;
                    in5Var.g.remove(str6);
                    ArrayList arrayList7 = new ArrayList();
                    for (int i8 = 0; i8 < arrayList6.size(); i8++) {
                        String str7 = (String) wm5Var.x.get(i8);
                        String str8 = (String) wm5Var.y.get(i8);
                        int intValue = ((Integer) wm5Var.z.get(i8)).intValue();
                        ImageReceiver imageReceiver = (ImageReceiver) arrayList6.get(i8);
                        int intValue2 = ((Integer) wm5Var.w.get(i8)).intValue();
                        wm5 wm5Var2 = (wm5) r2.get(str7);
                        if (wm5Var2 == null) {
                            wm5Var2 = new wm5(in5Var);
                            wm5Var2.a = wm5Var.a;
                            wm5Var2.h = wm5Var.h;
                            wm5Var2.o = wm5Var.o;
                            wm5Var2.p = hb4Var.e();
                            wm5Var2.j = wm5Var.j;
                            wm5Var2.c = wm5Var.c;
                            wm5Var2.d = str7;
                            wm5Var2.i = wm5Var.i;
                            wm5Var2.m = intValue;
                            wm5Var2.g = wm5Var.g;
                            wm5Var2.r = wm5Var.r;
                            wm5Var2.u = new xm5(in5Var, wm5Var2);
                            wm5Var2.f = str8;
                            wm5Var2.l = wm5Var.l;
                            wm5Var2.n = wm5Var.n;
                            r2.put(str7, wm5Var2);
                            in5Var.j.add(in5.j(str7));
                            arrayList7.add(wm5Var2.u);
                        }
                        wm5Var2.a(imageReceiver, str7, str8, intValue, intValue2);
                    }
                    for (int i9 = 0; i9 < arrayList7.size(); i9++) {
                        xm5 xm5Var = (xm5) arrayList7.get(i9);
                        wm5 wm5Var3 = xm5Var.c;
                        if (wm5Var3.m == 1) {
                            in5Var.q.c(xm5Var);
                        } else {
                            sw2 sw2Var = in5Var.p;
                            boolean z4 = wm5Var3.a;
                            if (!z4) {
                                sw2Var.getClass();
                                xm5Var = new xo3(z4 ? 1 : 0, xm5Var);
                            }
                            ((wo3) sw2Var.b).execute(xm5Var);
                        }
                    }
                    return;
                }
                return;
            case 27:
                ((xm5) obj3).c.c((Drawable) obj2, (String) obj);
                return;
            case 28:
                yr5 yr5Var = (yr5) obj3;
                TLRPC.TL_langPackString tL_langPackString = (TLRPC.TL_langPackString) obj2;
                String str9 = (String) obj;
                if (!yr5Var.N) {
                    yr5Var.f.setText(tL_langPackString.value);
                    uc7.e1().edit().putString("language_showed2", str9.toLowerCase()).apply();
                    return;
                }
                return;
            default:
                es5 es5Var = (es5) obj3;
                ArrayList arrayList8 = (ArrayList) obj2;
                ArrayList arrayList9 = (ArrayList) obj;
                if (es5Var.h) {
                    es5Var.d = arrayList8;
                    es5Var.e = arrayList9;
                    es5Var.f();
                    es5Var.n.r.e(false, true);
                    return;
                }
                return;
        }
    }

    public re4(Object obj, TLObject tLObject, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.c = tLObject;
        this.b = obj2;
    }

    public re4(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }
}
