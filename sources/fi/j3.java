package fi;

import android.text.TextUtils;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.c10;
import org.telegram.messenger.np;
import org.telegram.messenger.si;
import org.telegram.messenger.vn;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.p21;
public final class j3 implements View.OnClickListener {
    public final int f11895a;
    public final t3 f11896b;

    public j3(t3 t3Var, int i7) {
        this.f11895a = i7;
        this.f11896b = t3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f11895a) {
            case 0:
                b4 b4Var = this.f11896b.f12360x;
                b4.c0(b4Var, b4Var.l1);
                t3 t3Var = b4Var.f11466d1;
                if (t3Var != null) {
                    t3Var.a();
                    return;
                }
                return;
            case 1:
                b4 b4Var2 = this.f11896b.f12360x;
                b4.b0(b4Var2);
                t3 t3Var2 = b4Var2.f11466d1;
                if (t3Var2 != null) {
                    t3Var2.a();
                    return;
                }
                return;
            case 2:
                b4 b4Var3 = this.f11896b.f12360x;
                org.telegram.messenger.g0.g(b4Var3.f11543y1.e());
                b4.h0(b4Var3);
                t3 t3Var3 = b4Var3.f11466d1;
                if (t3Var3 != null) {
                    t3Var3.a();
                    return;
                }
                return;
            case 3:
                b4 b4Var4 = this.f11896b.f12360x;
                b4Var4.W0(false);
                t3 t3Var4 = b4Var4.f11466d1;
                if (t3Var4 != null) {
                    t3Var4.a();
                    return;
                }
                return;
            case 4:
                b4 b4Var5 = this.f11896b.f12360x;
                z3 z3Var = b4Var5.f11543y1;
                z3Var.f12579a.translated = false;
                f7 f7Var = np.s1(b4Var5.f11497m2).P1().f12327k;
                TL_stories.StoryItem storyItem = z3Var.f12579a;
                f7Var.k(storyItem.dialogId, storyItem);
                b4Var5.n0();
                b4Var5.d1(false);
                t3 t3Var5 = b4Var5.f11466d1;
                if (t3Var5 != null) {
                    t3Var5.a();
                    return;
                }
                return;
            case 5:
                t3 t3Var6 = this.f11896b;
                b4 b4Var6 = t3Var6.f12360x;
                z3 z3Var2 = b4Var6.f11543y1;
                z3Var2.f12579a.translated = true;
                b4Var6.n0();
                u3 u3Var = b4Var6.A1;
                if (u3Var != null) {
                    i9 i9Var = ((z8) u3Var).d;
                    i9Var.Z0 = true;
                    i9Var.V();
                }
                f7 f7Var2 = np.s1(b4Var6.f11497m2).P1().f12327k;
                TL_stories.StoryItem storyItem2 = z3Var2.f12579a;
                f7Var2.k(storyItem2.dialogId, storyItem2);
                long currentTimeMillis = System.currentTimeMillis();
                n3 n3Var = new n3(t3Var6, 1);
                c10 c10Var = np.s1(b4Var6.f11497m2).f25403t7;
                TL_stories.StoryItem storyItem3 = z3Var2.f12579a;
                di.x2 x2Var = new di.x2(n3Var, currentTimeMillis, 4);
                HashSet hashSet = c10Var.K;
                if (storyItem3 != null) {
                    Object obj = new Object();
                    String M0 = p21.M0();
                    if (storyItem3.translatedText != null && TextUtils.equals(storyItem3.translatedLng, M0)) {
                        x2Var.run();
                    } else if (hashSet.contains(obj)) {
                        x2Var.run();
                    } else {
                        hashSet.add(obj);
                        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
                        tL_messages_translateText.flags |= 2;
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        tL_textWithEntities.text = storyItem3.caption;
                        tL_textWithEntities.entities = storyItem3.entities;
                        tL_messages_translateText.text.add(tL_textWithEntities);
                        tL_messages_translateText.to_lang = c10.D(M0);
                        c10Var.getConnectionsManager().sendRequest(tL_messages_translateText, new vn(c10Var, storyItem3, M0, obj, x2Var, tL_textWithEntities, 1));
                    }
                }
                b4Var6.d1(false);
                b4Var6.R2 = true;
                b4Var6.f11526u0.E(true);
                t3 t3Var7 = b4Var6.f11466d1;
                if (t3Var7 != null) {
                    t3Var7.a();
                    return;
                }
                return;
            case 6:
                b4 b4Var7 = this.f11896b.f12360x;
                r6 r6Var = b4Var7.f11543y1.f12580b;
                if (r6Var != null) {
                    r6Var.a();
                    b4Var7.h1();
                }
                t3 t3Var8 = b4Var7.f11466d1;
                if (t3Var8 != null) {
                    t3Var8.a();
                    return;
                }
                return;
            case 7:
                b4 b4Var8 = this.f11896b.f12360x;
                b4.b0(b4Var8);
                t3 t3Var9 = b4Var8.f11466d1;
                if (t3Var9 != null) {
                    t3Var9.a();
                    return;
                }
                return;
            case 8:
                b4 b4Var9 = this.f11896b.f12360x;
                org.telegram.messenger.g0.g(b4Var9.f11543y1.e());
                b4.h0(b4Var9);
                t3 t3Var10 = b4Var9.f11466d1;
                if (t3Var10 != null) {
                    t3Var10.a();
                    return;
                }
                return;
            case 9:
                b4 b4Var10 = this.f11896b.f12360x;
                b4Var10.W0(false);
                t3 t3Var11 = b4Var10.f11466d1;
                if (t3Var11 != null) {
                    t3Var11.a();
                    return;
                }
                return;
            case 10:
                e1 e1Var = e1.X;
                if (e1Var != null && e1Var.f11658n) {
                    long j3 = e1Var.K;
                    boolean z10 = !e1Var.J;
                    e1Var.J = z10;
                    NativeInstance.switchCameraCapturer(j3, z10);
                }
                t3 t3Var12 = this.f11896b.f12360x.f11466d1;
                if (t3Var12 != null) {
                    t3Var12.a();
                    return;
                }
                return;
            case 11:
                this.f11896b.f12360x.f11501n3.b();
                return;
            case 12:
                this.f11896b.f12360x.f11505o3.b();
                return;
            case 13:
                b4 b4Var11 = this.f11896b.f12360x;
                b4.d0(b4Var11);
                t3 t3Var13 = b4Var11.f11466d1;
                if (t3Var13 != null) {
                    t3Var13.a();
                    return;
                }
                return;
            case 14:
                b4 b4Var12 = this.f11896b.f12360x;
                si.b0(b4Var12.f11497m2).N1(b4Var12.l1);
                b4Var12.C1.l0(b4Var12.l1, true, false);
                t3 t3Var14 = b4Var12.f11466d1;
                if (t3Var14 != null) {
                    t3Var14.a();
                    return;
                }
                return;
            default:
                b4 b4Var13 = this.f11896b.f12360x;
                b4.c0(b4Var13, b4Var13.l1);
                t3 t3Var15 = b4Var13.f11466d1;
                if (t3Var15 != null) {
                    t3Var15.a();
                    return;
                }
                return;
        }
    }
}
