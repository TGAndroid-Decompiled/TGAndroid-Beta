package fi;

import android.text.TextUtils;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.a10;
import org.telegram.messenger.np;
import org.telegram.messenger.si;
import org.telegram.messenger.tn;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b31;
public final class h3 implements View.OnClickListener {
    public final int f12028a;
    public final r3 f12029b;

    public h3(r3 r3Var, int i7) {
        this.f12028a = i7;
        this.f12029b = r3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f12028a) {
            case 0:
                z3 z3Var = this.f12029b.f12493x;
                z3.c0(z3Var, z3Var.l1);
                r3 r3Var = z3Var.f12811d1;
                if (r3Var != null) {
                    r3Var.a();
                    return;
                }
                return;
            case 1:
                z3 z3Var2 = this.f12029b.f12493x;
                z3.b0(z3Var2);
                r3 r3Var2 = z3Var2.f12811d1;
                if (r3Var2 != null) {
                    r3Var2.a();
                    return;
                }
                return;
            case 2:
                z3 z3Var3 = this.f12029b.f12493x;
                org.telegram.messenger.g0.g(z3Var3.f12888y1.e());
                z3.h0(z3Var3);
                r3 r3Var3 = z3Var3.f12811d1;
                if (r3Var3 != null) {
                    r3Var3.a();
                    return;
                }
                return;
            case 3:
                z3 z3Var4 = this.f12029b.f12493x;
                z3Var4.W0(false);
                r3 r3Var4 = z3Var4.f12811d1;
                if (r3Var4 != null) {
                    r3Var4.a();
                    return;
                }
                return;
            case 4:
                z3 z3Var5 = this.f12029b.f12493x;
                x3 x3Var = z3Var5.f12888y1;
                x3Var.f12715a.translated = false;
                c7 c7Var = np.u1(z3Var5.f12842m2).R1().f12385k;
                TL_stories.StoryItem storyItem = x3Var.f12715a;
                c7Var.k(storyItem.dialogId, storyItem);
                z3Var5.n0();
                z3Var5.d1(false);
                r3 r3Var5 = z3Var5.f12811d1;
                if (r3Var5 != null) {
                    r3Var5.a();
                    return;
                }
                return;
            case 5:
                r3 r3Var6 = this.f12029b;
                z3 z3Var6 = r3Var6.f12493x;
                x3 x3Var2 = z3Var6.f12888y1;
                x3Var2.f12715a.translated = true;
                z3Var6.n0();
                s3 s3Var = z3Var6.A1;
                if (s3Var != null) {
                    f9 f9Var = ((w8) s3Var).d;
                    f9Var.Z0 = true;
                    f9Var.V();
                }
                c7 c7Var2 = np.u1(z3Var6.f12842m2).R1().f12385k;
                TL_stories.StoryItem storyItem2 = x3Var2.f12715a;
                c7Var2.k(storyItem2.dialogId, storyItem2);
                long currentTimeMillis = System.currentTimeMillis();
                l3 l3Var = new l3(r3Var6, 1);
                a10 a10Var = np.u1(z3Var6.f12842m2).f25950v7;
                TL_stories.StoryItem storyItem3 = x3Var2.f12715a;
                bi.e4 e4Var = new bi.e4(l3Var, currentTimeMillis, 5);
                HashSet hashSet = a10Var.K;
                if (storyItem3 != null) {
                    Object obj = new Object();
                    String N0 = b31.N0();
                    if (storyItem3.translatedText != null && TextUtils.equals(storyItem3.translatedLng, N0)) {
                        e4Var.run();
                    } else if (hashSet.contains(obj)) {
                        e4Var.run();
                    } else {
                        hashSet.add(obj);
                        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
                        tL_messages_translateText.flags |= 2;
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        tL_textWithEntities.text = storyItem3.caption;
                        tL_textWithEntities.entities = storyItem3.entities;
                        tL_messages_translateText.text.add(tL_textWithEntities);
                        tL_messages_translateText.to_lang = a10.D(N0);
                        a10Var.getConnectionsManager().sendRequest(tL_messages_translateText, new tn(a10Var, storyItem3, N0, obj, e4Var, tL_textWithEntities, 1));
                    }
                }
                z3Var6.d1(false);
                z3Var6.R2 = true;
                z3Var6.f12871u0.E(true);
                r3 r3Var7 = z3Var6.f12811d1;
                if (r3Var7 != null) {
                    r3Var7.a();
                    return;
                }
                return;
            case 6:
                z3 z3Var7 = this.f12029b.f12493x;
                o6 o6Var = z3Var7.f12888y1.f12716b;
                if (o6Var != null) {
                    o6Var.a();
                    z3Var7.h1();
                }
                r3 r3Var8 = z3Var7.f12811d1;
                if (r3Var8 != null) {
                    r3Var8.a();
                    return;
                }
                return;
            case 7:
                z3 z3Var8 = this.f12029b.f12493x;
                z3.b0(z3Var8);
                r3 r3Var9 = z3Var8.f12811d1;
                if (r3Var9 != null) {
                    r3Var9.a();
                    return;
                }
                return;
            case 8:
                z3 z3Var9 = this.f12029b.f12493x;
                org.telegram.messenger.g0.g(z3Var9.f12888y1.e());
                z3.h0(z3Var9);
                r3 r3Var10 = z3Var9.f12811d1;
                if (r3Var10 != null) {
                    r3Var10.a();
                    return;
                }
                return;
            case 9:
                z3 z3Var10 = this.f12029b.f12493x;
                z3Var10.W0(false);
                r3 r3Var11 = z3Var10.f12811d1;
                if (r3Var11 != null) {
                    r3Var11.a();
                    return;
                }
                return;
            case 10:
                c1 c1Var = c1.X;
                if (c1Var != null && c1Var.f11790n) {
                    long j3 = c1Var.K;
                    boolean z10 = !c1Var.J;
                    c1Var.J = z10;
                    NativeInstance.switchCameraCapturer(j3, z10);
                }
                r3 r3Var12 = this.f12029b.f12493x.f12811d1;
                if (r3Var12 != null) {
                    r3Var12.a();
                    return;
                }
                return;
            case 11:
                this.f12029b.f12493x.f12846n3.b();
                return;
            case 12:
                this.f12029b.f12493x.f12850o3.b();
                return;
            case 13:
                z3 z3Var11 = this.f12029b.f12493x;
                z3.d0(z3Var11);
                r3 r3Var13 = z3Var11.f12811d1;
                if (r3Var13 != null) {
                    r3Var13.a();
                    return;
                }
                return;
            case 14:
                z3 z3Var12 = this.f12029b.f12493x;
                si.d0(z3Var12.f12842m2).S1(z3Var12.l1);
                z3Var12.C1.l0(z3Var12.l1, true, false);
                r3 r3Var14 = z3Var12.f12811d1;
                if (r3Var14 != null) {
                    r3Var14.a();
                    return;
                }
                return;
            default:
                z3 z3Var13 = this.f12029b.f12493x;
                z3.c0(z3Var13, z3Var13.l1);
                r3 r3Var15 = z3Var13.f12811d1;
                if (r3Var15 != null) {
                    r3Var15.a();
                    return;
                }
                return;
        }
    }
}
