package defpackage;

import android.media.MediaDrmException;
import android.text.Editable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class dhf implements c7a, lr2, mae, d40, rx2, t64, lv8, g22, ft8, tcb, gec {
    public static dhf b;
    public final byte a;
    public static final dhf c = new dhf((byte) 1);
    public static final dhf d = new dhf((byte) 2);
    public static final v7a e = new v7a(null, null, null, null, null);
    public static final dhf f = new dhf((byte) 3);
    public static final dhf h = new dhf((byte) 4);
    public static final dhf n = new dhf((byte) 5);
    public static final dhf r = new dhf((byte) 6);
    public static final dhf s = new dhf((byte) 7);
    public static final dhf w = new dhf((byte) 8);
    public static final dhf x = new dhf((byte) 9);
    public static final dhf y = new dhf((byte) 10);
    public static final dhf E = new dhf((byte) 11);
    public static final dhf F = new dhf((byte) 12);

    public dhf(byte b2) {
        this.a = b2;
    }

    public static t76 H(y79 y79Var) {
        ko5 listIterator = y79Var.listIterator(0);
        while (listIterator.hasNext()) {
            if (((bt6) listIterator.next()).b == null) {
                return kke.b(new UnsupportedOperationException());
            }
        }
        return kke.c(y79Var);
    }

    public static synchronized void S() {
        synchronized (dhf.class) {
            if (b == null) {
                b = new dhf((byte) 0);
            }
        }
    }

    @Override
    public final boolean B() {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final int C(go4 go4Var) {
        return 1;
    }

    @Override
    public final void E0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        byte b2 = this.a;
    }

    @Override
    public final void I() {
        byte b2 = this.a;
    }

    @Override
    public final boolean K0() {
        byte b2 = this.a;
        return false;
    }

    public final java.lang.Object P(java.util.List r6, defpackage.k83 r7, defpackage.qx2 r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhf.P(java.util.List, k83, qx2):java.lang.Object");
    }

    @Override
    public final Object X(sm2 sm2Var) {
        return new cz5((g8e) sm2Var.a(g8e.class), (f64) sm2Var.a(f64.class));
    }

    @Override
    public final void a1(vr0 vr0Var) {
        byte b2 = this.a;
        vr0Var.run();
    }

    @Override
    public final Map b(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public final void b0() {
        byte b2 = this.a;
    }

    @Override
    public final s64 c() {
        throw new IllegalStateException();
    }

    @Override
    public final void d(String str) {
        if (e21.a) {
            fc4.b("AudioRecorderV2 ".concat(str));
        }
    }

    @Override
    public final Object e() {
        return e;
    }

    @Override
    public final lr4 f(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public final void f0(Object obj) {
        byte b2 = this.a;
    }

    @Override
    public final Object mo8get() {
        return tpb.a;
    }

    @Override
    public final boolean h(go4 go4Var) {
        return false;
    }

    @Override
    public final byte[] i() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override
    public final void j(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public final byte[] l(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public final void n(Object obj, p6c p6cVar) {
        byte[] bytes = lw5.d.b(v7a.Companion.serializer(), (v7a) obj).getBytes(jl1.a);
        bytes.getClass();
        p6cVar.a.write(bytes);
    }

    @Override
    public final void n0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
        byte b2 = this.a;
    }

    @Override
    public final void o(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public final Object p(FileInputStream fileInputStream) {
        try {
            lw5 lw5Var = lw5.d;
            String str = new String(fsd.b(fileInputStream), jl1.a);
            dhf dhfVar = lw5Var.b;
            return (v7a) lw5Var.a(v7a.Companion.serializer(), str);
        } catch (Exception e2) {
            throw new IOException("Cannot parse session configs", e2);
        }
    }

    @Override
    public final r64 q(byte[] bArr, List list, int i, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override
    public final int r() {
        return 1;
    }

    @Override
    public final void s(String str, Throwable th) {
        fc4.e("AudioRecorderV2 ".concat(str), th);
    }

    @Override
    public final boolean u(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public final vcb v(go4 go4Var) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    public final void x(c44 c44Var) {
        c44Var.a(t7f.class, qie.a);
        c44Var.a(cff.class, h0f.a);
        c44Var.a(w7f.class, tie.a);
        c44Var.a(d8f.class, fje.a);
        c44Var.a(y7f.class, zie.a);
        c44Var.a(b8f.class, jje.a);
        c44Var.a(z2e.class, lbe.a);
        c44Var.a(u3f.class, gbe.a);
        c44Var.a(c6f.class, oge.a);
        c44Var.a(aef.class, zxe.a);
        c44Var.a(s3f.class, abe.a);
        c44Var.a(q3f.class, vae.a);
        c44Var.a(naf.class, mqe.a);
        c44Var.a(ggf.class, efe.a);
        c44Var.a(r5f.class, qfe.a);
        c44Var.a(j5f.class, yee.a);
        c44Var.a(oaf.class, sqe.a);
        c44Var.a(xdf.class, lxe.a);
        c44Var.a(ydf.class, qxe.a);
        c44Var.a(vdf.class, hxe.a);
        c44Var.a(m8f.class, wke.a);
        c44Var.a(egf.class, x6e.a);
        c44Var.a(n8f.class, ale.a);
        c44Var.a(bbf.class, gse.a);
        c44Var.a(qbf.class, qse.a);
        c44Var.a(ebf.class, nse.a);
        c44Var.a(dbf.class, kse.a);
        c44Var.a(dcf.class, que.a);
        c44Var.a(fcf.class, vue.a);
        c44Var.a(icf.class, cve.a);
        c44Var.a(gcf.class, xue.a);
        c44Var.a(l8f.class, ske.a);
        c44Var.a(jcf.class, ive.a);
        c44Var.a(lcf.class, kve.a);
        c44Var.a(mcf.class, ove.a);
        c44Var.a(ocf.class, tve.a);
        c44Var.a(ucf.class, fwe.a);
        c44Var.a(scf.class, jwe.a);
        c44Var.a(ccf.class, pte.a);
        c44Var.a(k6f.class, nhe.a);
        c44Var.a(zbf.class, zte.a);
        c44Var.a(xbf.class, tte.a);
        c44Var.a(acf.class, mue.a);
        c44Var.a(zdf.class, uxe.a);
        c44Var.a(lff.class, c1f.a);
        c44Var.a(p2f.class, n8e.a);
        c44Var.a(ocd.class, q7e.a);
        c44Var.a(v1f.class, i7e.a);
        c44Var.a(n2f.class, v7e.a);
        c44Var.a(v2f.class, a9e.a);
        c44Var.a(r2f.class, u8e.a);
        c44Var.a(x2f.class, g9e.a);
        c44Var.a(a3f.class, m9e.a);
        c44Var.a(c3f.class, r9e.a);
        c44Var.a(e3f.class, y9e.a);
        c44Var.a(g3f.class, cae.a);
        c44Var.a(awd.class, b6e.a);
        c44Var.a(nwd.class, n6e.a);
        c44Var.a(gwd.class, i6e.a);
        c44Var.a(g6f.class, dhe.a);
        c44Var.a(y3f.class, rbe.a);
        c44Var.a(nmd.class, wwd.a);
        c44Var.a(hmd.class, bxd.a);
        c44Var.a(f5f.class, aee.a);
        c44Var.a(wmd.class, hxd.a);
        c44Var.a(smd.class, mxd.a);
        c44Var.a(xpd.class, mzd.a);
        c44Var.a(apd.class, pzd.a);
        c44Var.a(hnd.class, qxd.a);
        c44Var.a(bnd.class, vxd.a);
        c44Var.a(crd.class, q0e.a);
        c44Var.a(zqd.class, f1e.a);
        c44Var.a(zrd.class, b2e.a);
        c44Var.a(srd.class, g2e.a);
        c44Var.a(uvd.class, p5e.a);
        c44Var.a(cvd.class, v5e.a);
        c44Var.a(lsd.class, m2e.a);
        c44Var.a(fsd.class, s2e.a);
        c44Var.a(wsd.class, x2e.a);
        c44Var.a(psd.class, e4e.a);
        c44Var.a(wff.class, iye.a);
        c44Var.a(nff.class, wbe.a);
        c44Var.a(sff.class, mke.a);
        c44Var.a(rff.class, fke.a);
        c44Var.a(pff.class, ife.a);
        c44Var.a(vff.class, gye.a);
        c44Var.a(tff.class, eye.a);
        c44Var.a(xff.class, tye.a);
        c44Var.a(qff.class, uge.a);
        c44Var.a(dgf.class, j1f.a);
        c44Var.a(bgf.class, n1f.a);
        c44Var.a(zff.class, f1f.a);
        c44Var.a(cef.class, yye.a);
        c44Var.a(e6f.class, zge.a);
        c44Var.a(m6f.class, she.a);
        c44Var.a(u1f.class, c7e.a);
        c44Var.a(s5f.class, vfe.a);
        c44Var.a(i6f.class, hhe.a);
        c44Var.a(d3f.class, ree.a);
        c44Var.a(d4f.class, jce.a);
        c44Var.a(f4f.class, pce.a);
        c44Var.a(a4f.class, ece.a);
        c44Var.a(i4f.class, vce.a);
        c44Var.a(i8f.class, cke.a);
        c44Var.a(g8f.class, nje.a);
        c44Var.a(bmd.class, swd.a);
        c44Var.a(gff.class, r0f.a);
        c44Var.a(jff.class, x0f.a);
        c44Var.a(hff.class, u0f.a);
        c44Var.a(r1f.class, s6e.a);
        c44Var.a(o3f.class, rae.a);
        c44Var.a(l3f.class, lae.a);
        c44Var.a(j3f.class, gae.a);
        c44Var.a(iaf.class, xpe.a);
        c44Var.a(laf.class, gqe.a);
        c44Var.a(kaf.class, dqe.a);
        c44Var.a(vod.class, bzd.a);
        c44Var.a(pod.class, izd.a);
        c44Var.a(qaf.class, vqe.a);
        c44Var.a(uaf.class, lre.a);
        c44Var.a(raf.class, bre.a);
        c44Var.a(taf.class, hre.a);
        c44Var.a(iqd.class, uzd.a);
        c44Var.a(dqd.class, a0e.a);
        c44Var.a(ief.class, pze.a);
        c44Var.a(hef.class, nze.a);
        c44Var.a(dff.class, k0f.a);
        c44Var.a(eff.class, o0f.a);
        c44Var.a(rbf.class, xse.a);
        c44Var.a(wbf.class, lte.a);
        c44Var.a(tbf.class, bte.a);
        c44Var.a(ubf.class, fte.a);
        c44Var.a(w5f.class, ige.a);
        c44Var.a(lrd.class, m1e.a);
        c44Var.a(grd.class, s1e.a);
        c44Var.a(u5f.class, cge.a);
        c44Var.a(l5f.class, mfe.a);
        c44Var.a(waf.class, qre.a);
        c44Var.a(abf.class, bse.a);
        c44Var.a(yaf.class, xre.a);
        c44Var.a(vqd.class, d0e.a);
        c44Var.a(qqd.class, k0e.a);
        c44Var.a(t9f.class, qne.a);
        c44Var.a(v9f.class, une.a);
        c44Var.a(w9f.class, yne.a);
        c44Var.a(znd.class, jyd.a);
        c44Var.a(u9.class, oyd.a);
        c44Var.a(e9f.class, bne.a);
        c44Var.a(f9f.class, gne.a);
        c44Var.a(s9f.class, mne.a);
        c44Var.a(pnd.class, zxd.a);
        c44Var.a(knd.class, eyd.a);
        c44Var.a(y9f.class, doe.a);
        c44Var.a(z9f.class, foe.a);
        c44Var.a(baf.class, koe.a);
        c44Var.a(caf.class, noe.a);
        c44Var.a(kod.class, syd.a);
        c44Var.a(dod.class, xyd.a);
        c44Var.a(eef.class, eze.a);
        c44Var.a(def.class, gze.a);
        c44Var.a(o6f.class, xhe.a);
        c44Var.a(t6f.class, hie.a);
        c44Var.a(q6f.class, cie.a);
        c44Var.a(v6f.class, lie.a);
        c44Var.a(vcf.class, nwe.a);
        c44Var.a(xcf.class, rwe.a);
        c44Var.a(lm2.class, u4e.a);
        c44Var.a(ntd.class, y4e.a);
        c44Var.a(jef.class, tze.a);
        c44Var.a(pcf.class, wve.a);
        c44Var.a(rcf.class, awe.a);
        c44Var.a(htd.class, j4e.a);
        c44Var.a(atd.class, n4e.a);
        c44Var.a(fef.class, jze.a);
        c44Var.a(c9f.class, kle.a);
        c44Var.a(b9f.class, wme.a);
        c44Var.a(w8f.class, kme.a);
        c44Var.a(v8f.class, eme.a);
        c44Var.a(y8f.class, nme.a);
        c44Var.a(z8f.class, sme.a);
        c44Var.a(u8f.class, ame.a);
        c44Var.a(p8f.class, fle.a);
        c44Var.a(s8f.class, wle.a);
        c44Var.a(r8f.class, rle.a);
        c44Var.a(faf.class, ppe.a);
        c44Var.a(r4f.class, pde.a);
        c44Var.a(eaf.class, hpe.a);
        c44Var.a(haf.class, spe.a);
        c44Var.a(o4f.class, lde.a);
        c44Var.a(u4f.class, ude.a);
        c44Var.a(bef.class, vye.a);
        c44Var.a(zcf.class, vwe.a);
        c44Var.a(pef.class, e0f.a);
        c44Var.a(ndf.class, exe.a);
        c44Var.a(kdf.class, zwe.a);
        c44Var.a(mef.class, xze.a);
        c44Var.a(vud.class, c5e.a);
        c44Var.a(lud.class, j5e.a);
        c44Var.a(nef.class, a0f.a);
        c44Var.a(m4f.class, bde.a);
    }

    public final java.lang.Object z(defpackage.ti4 r8, defpackage.qx2 r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhf.z(ti4, qx2):java.lang.Object");
    }

    @Override
    public final void z0(TLRPC.User user) {
        byte b2 = this.a;
    }

    @Override
    public final wce zzb(Class cls) {
        if (f4e.class.isAssignableFrom(cls)) {
            try {
                return (wce) f4e.h(cls.asSubclass(f4e.class)).d(3);
            } catch (Exception e2) {
                rjb.k("Unable to get message info for ".concat(cls.getName()), e2);
                return null;
            }
        }
        u36.j("Unsupported message type: ".concat(cls.getName()));
        return null;
    }

    @Override
    public final boolean zzc(Class cls) {
        return f4e.class.isAssignableFrom(cls);
    }

    private final void J() {
    }

    private final void K() {
    }

    private final void N() {
    }

    private final void O() {
    }

    @Override
    public final void D() {
    }

    @Override
    public final void onFirstFrameRendered() {
    }

    @Override
    public final void release() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void y() {
    }

    private final void F(TLRPC.User user) {
    }

    private final void G(TLRPC.User user) {
    }

    private final void L(Object obj) {
    }

    private final void M(Object obj) {
    }

    @Override
    public final void a(jec jecVar) {
    }

    @Override
    public final void k(byte[] bArr) {
    }

    @Override
    public final void m(sz4 sz4Var) {
    }

    @Override
    public final void g(int i, Serializable serializable) {
    }

    @Override
    public final void t(byte[] bArr, we8 we8Var) {
    }

    private final void Q(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }

    private final void R(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }

    private final void A(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
    }

    private final void E(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
    }
}
