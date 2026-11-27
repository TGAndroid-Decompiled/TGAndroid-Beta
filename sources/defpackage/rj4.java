package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.MappedByteBuffer;
import java.util.Iterator;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class rj4 implements Runnable {
    public final byte a;
    public final Object b;

    public rj4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a() {
        s25 s25Var = (s25) this.b;
        synchronized (s25Var) {
            if (s25Var.a) {
                return;
            }
            s25Var.a = true;
            Runnable runnable = s25Var.b;
            if (runnable != null) {
                runnable.run();
                s25Var.b = null;
            }
        }
    }

    private final void b() {
        u25 u25Var = (u25) this.b;
        synchronized (u25Var) {
            if (u25Var.a) {
                return;
            }
            u25Var.a = true;
            Runnable runnable = u25Var.b;
            if (runnable != null) {
                runnable.run();
                u25Var.b = null;
            }
        }
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                tj4 tj4Var = (tj4) this.b;
                if (!tj4Var.c) {
                    tj4Var.setLayerType(0, null);
                    return;
                }
                return;
            case 1:
                ((pl4) this.b).invalidate();
                return;
            case 2:
                xl4 xl4Var = (xl4) ((m33) this.b).b;
                xl4Var.j.invalidate();
                xl4Var.k.requestLayout();
                return;
            case 3:
                ((ul4) this.b).invalidate();
                return;
            case 4:
                jm4 jm4Var = (jm4) ((md) this.b).b;
                jm4Var.k();
                jm4Var.j();
                return;
            case 5:
                jm4 jm4Var2 = ((fm4) this.b).b;
                jm4Var2.c.dismiss();
                jm4Var2.f.removeAllViews();
                return;
            case 6:
                ((fm4) this.b).b.c.dismiss();
                return;
            case 7:
                vn4 vn4Var = (vn4) this.b;
                synchronized (vn4Var.c) {
                    if (vn4Var.h != null) {
                        try {
                            go4 d = vn4Var.d();
                            int i = d.e;
                            if (i == 2) {
                                synchronized (vn4Var.c) {
                                }
                            }
                            if (i == 0) {
                                int i2 = n1c.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                Context context = vn4Var.a;
                                go4[] go4VarArr = {d};
                                p1f p1fVar = r7c.a;
                                q0f.a("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface b = r7c.a.b(context, go4VarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer d2 = r1f.d(vn4Var.a, d.a);
                                    if (d2 != null && b != null) {
                                        try {
                                            Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                            u8a u8aVar = new u8a(b, ste.a(d2));
                                            Trace.endSection();
                                            synchronized (vn4Var.c) {
                                                rje rjeVar = vn4Var.h;
                                                if (rjeVar != null) {
                                                    rjeVar.b(u8aVar);
                                                }
                                            }
                                            vn4Var.a();
                                            return;
                                        } catch (Throwable th) {
                                            int i3 = n1c.a;
                                            throw th;
                                        }
                                    }
                                    throw new RuntimeException("Unable to open file.");
                                } finally {
                                    Trace.endSection();
                                }
                            }
                            throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                        } catch (Throwable th2) {
                            synchronized (vn4Var.c) {
                                rje rjeVar2 = vn4Var.h;
                                if (rjeVar2 != null) {
                                    rjeVar2.a(th2);
                                }
                                vn4Var.a();
                                return;
                            }
                        }
                    }
                    return;
                }
            case 8:
                Iterator it = ((kq4) this.b).n.iterator();
                if (!it.hasNext()) {
                    return;
                }
                throw qu6.l(it);
            case 9:
                ((st4) this.b).b(null);
                return;
            case 10:
                ((vt4) this.b).E();
                return;
            case 11:
                RecyclerView recyclerView = (RecyclerView) this.b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().f();
                    return;
                }
                return;
            case 12:
                tv4 tv4Var = ((sv4) this.b).r;
                kl8 kl8Var = new kl8(tv4Var.r1, tv4Var.a, null, null, null, tv4Var.J0);
                kl8Var.E2 = true;
                kl8Var.X1 = true;
                tv4Var.r1.showDialog(kl8Var);
                return;
            case 13:
                zv4 zv4Var = (zv4) this.b;
                Drawable drawable = zv4Var.Q;
                if (drawable != null && !zv4Var.b0) {
                    drawable.setAlpha(255);
                }
                zv4Var.a.setAlpha(1.0f);
                if (zv4Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) zv4Var.getParent()).removeView(zv4Var);
                }
                Runnable runnable = zv4Var.R;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 14:
                EditTextBoldCursor editTextBoldCursor = ((ow4) this.b).r1;
                editTextBoldCursor.requestFocus();
                hl.E3(editTextBoldCursor);
                return;
            case 15:
                l9c l9cVar = ((yx4) this.b).T1;
                if (l9cVar != null) {
                    l9cVar.O(false);
                    return;
                }
                return;
            case 16:
                ((px4) this.b).c();
                return;
            case 17:
                ((vx4) this.b).invalidateSelf();
                return;
            case 18:
                xx4 xx4Var = (xx4) this.b;
                yza yzaVar = xx4Var.e;
                if (yzaVar != null) {
                    yzaVar.d();
                    xx4Var.invalidateSelf();
                    return;
                }
                return;
            case 19:
                ((a05) this.b).k();
                return;
            case 20:
                a();
                return;
            case 21:
                ((c35) this.b).close();
                return;
            case 22:
                b();
                return;
            case 23:
                p35 p35Var = (p35) this.b;
                p35Var.c("AUTH_CANCELED");
                p35Var.e();
                if (tne.b == p35Var) {
                    tne.b = null;
                    return;
                }
                return;
            case 24:
                ((sk7) this.b).dismiss();
                return;
            case 25:
                r55 r55Var = (r55) this.b;
                r55Var.b.g3.O(true);
                r55Var.Y(true);
                return;
            case 26:
                v85 v85Var = (v85) this.b;
                j95 j95Var = v85Var.f;
                i75 i75Var = j95Var.l1;
                jn5 jn5Var = v85Var.d;
                if (jn5Var != null) {
                    i75Var.L0 = jn5Var;
                    i75Var.r1 = null;
                    i75Var.s1 = null;
                    v85Var.d = null;
                }
                TLRPC.Chat M0 = uc7.s1(j95Var.n1.a).M0(Long.valueOf(-v85Var.e));
                jn5 a = jn5.a(0, M0);
                jn5 a2 = jn5.a(1, M0);
                if (jn5.e(v85Var.b) == null) {
                    a2 = jn5.e(v85Var.c);
                }
                i75Var.setCreateThumbFromParent(false);
                i75Var.H(null, a, a2, true);
                v85Var.c = null;
                v85Var.b = null;
                hl.V3(j95Var.J1);
                v85Var.a(1.0f);
                return;
            case 27:
                tb tbVar = (tb) ((qc) this.b).i;
                if (tbVar != null) {
                    tbVar.invalidate();
                    return;
                }
                return;
            case 28:
                ((l95) this.b).invalidate();
                return;
            default:
                v95 v95Var = (v95) this.b;
                GroupCallMessage groupCallMessage = v95Var.I;
                if (groupCallMessage != null) {
                    v95Var.a.a(groupCallMessage.isSendDelayed(), true);
                    v95Var.b.a(v95Var.I.isSendError(), true);
                    return;
                }
                return;
        }
    }
}
