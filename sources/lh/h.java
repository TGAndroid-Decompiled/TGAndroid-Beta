package lh;

import ai.w;
import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.kb1;
public final class h extends FrameLayout implements oe.d {
    public static final int[] f17044s;
    public final String[] f17045a;
    public final u6 f17046b;
    public final fh.a f17047c;
    public final ch.b d;
    public final k6.c[] e;
    public final ag.g[] f17048f;
    public a h;
    public b f17049n;
    public int f17050r;

    static {
        int i10 = R.drawable.msg_input_attach2;
        int i11 = R.drawable.pagedown;
        f17044s = new int[]{i10, i11, R.drawable.mentionbutton, R.drawable.reactionbutton, R.drawable.menu_poll_notify, i11, i11};
    }

    public h(Context context, u6 u6Var, fh.b bVar, ch.b bVar2) {
        super(context);
        this.f17045a = new String[]{LocaleController.getString(R.string.AttachMenu), LocaleController.getString(R.string.AccDescrPageDown), LocaleController.getString(R.string.AccDescrMentionDown), LocaleController.getString(R.string.AccDescrReactionMentionDown), LocaleController.getString(R.string.AccDescrPollVotesMentionDown), LocaleController.getString(R.string.AccDescrSearchPrev), LocaleController.getString(R.string.AccDescrSearchNext)};
        this.e = new k6.c[7];
        this.f17048f = new ag.g[7];
        this.f17050r = 83;
        this.d = bVar2;
        this.f17047c = bVar;
        this.f17046b = u6Var;
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        int i11 = i10 >> 16;
        int i12 = i10 & 65535;
        if (i11 >= 0) {
            k6.c[] cVarArr = this.e;
            if (i11 < cVarArr.length && cVarArr[i11] != null) {
                if (i12 == 1 || i12 == 2) {
                    a();
                }
            }
        }
    }

    public final void a() {
        int i10;
        float f7 = 0.0f;
        int i11 = 0;
        while (true) {
            k6.c[] cVarArr = this.e;
            if (i11 < cVarArr.length) {
                k6.c cVar = cVarArr[i11];
                if (cVar != null) {
                    kh.b bVar = (kh.b) cVar.f16405b;
                    float f10 = ((oe.b) cVar.f16406c).e;
                    float f11 = ((oe.b) cVar.d).e;
                    if (f10 > 0.0f) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    bVar.setVisibility(i10);
                    bVar.setAlpha(f10);
                    bVar.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f10));
                    bVar.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f10));
                    if (i11 != 0) {
                        bVar.setTranslationY(((1.0f - f10) * AndroidUtilities.dp(80.0f)) - f7);
                    }
                    f7 += (AndroidUtilities.dp((f11 * 10.0f) + 10.0f) + AndroidUtilities.dp(44.0f)) * f10;
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public final ag.g b(int i10) {
        ag.g[] gVarArr = this.f17048f;
        if (gVarArr[i10] == 0) {
            ?? obj = new Object();
            obj.f1279a = 0;
            obj.f1280b = false;
            obj.f1281c = true;
            gVarArr[i10] = obj;
        }
        return gVarArr[i10];
    }

    public final void c(int i10, int i11, boolean z10) {
        boolean z11;
        b(i10).f1279a = i11;
        k6.c cVar = this.e[i10];
        if (cVar != null) {
            ((kh.b) cVar.f16405b).a(i11, z10);
            oe.b bVar = (oe.b) cVar.d;
            if (i11 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            bVar.a(z11, z10);
        }
    }

    public final void d(boolean z10) {
        b(1).f1280b = z10;
        k6.c cVar = this.e[1];
        if (cVar != null) {
            ((kh.b) cVar.f16405b).c(z10, true);
        }
    }

    public final void e(int i10, boolean z10, boolean z11) {
        Interpolator interpolator;
        long j10;
        Interpolator interpolator2;
        long j11;
        int i11;
        int i12;
        k6.c[] cVarArr = this.e;
        k6.c cVar = cVarArr[i10];
        if (cVar == null && !z10) {
            return;
        }
        if (cVar == null) {
            int i13 = i10 << 16;
            int i14 = i13 | 1;
            if (i10 == 0) {
                interpolator = ds.h;
            } else {
                interpolator = ne.a.f18778a;
            }
            if (i10 == 0) {
                j10 = 300;
            } else {
                j10 = 280;
            }
            oe.b bVar = new oe.b(i14, this, interpolator, j10, false);
            int i15 = i13 | 2;
            if (i10 == 0) {
                interpolator2 = ds.h;
            } else {
                interpolator2 = ne.a.f18778a;
            }
            Interpolator interpolator3 = interpolator2;
            if (i10 == 0) {
                j11 = 300;
            } else {
                j11 = 280;
            }
            oe.b bVar2 = new oe.b(i15, this, interpolator3, j11, false);
            if (i10 == 0) {
                i11 = 50;
                i12 = 32;
            } else {
                i11 = 56;
                i12 = 48;
            }
            int i16 = i12;
            Context context = getContext();
            int i17 = f17044s[i10];
            u6 u6Var = this.f17046b;
            kh.b bVar3 = new kh.b(context, u6Var);
            kh.a d = kh.a.d(context, this.d, this.f17047c, u6Var, i17, i16);
            bVar3.f16653b = d;
            bVar3.addView(d, kb1.i(i11, i11, 80));
            d.setIconPadding(AndroidUtilities.dp(2.0f));
            kb1.c(bVar3, 0.13f, 2.0f);
            float f7 = i11 / 2.0f;
            bVar3.setPivotX(AndroidUtilities.dp(f7));
            bVar3.setPivotY(AndroidUtilities.dp(f7 + 8.0f));
            bVar3.setVisibility(8);
            bVar3.setContentDescription(this.f17045a[i10]);
            bVar3.setOnClickListener(new w(this, i10, 6));
            bVar3.setOnLongClickListener(new g(this, i10, 0));
            if (i10 == 6) {
                kh.a aVar = bVar3.f16653b;
                aVar.h = -1.0f;
                aVar.a();
            }
            boolean z12 = true;
            if (i10 == 1) {
                bVar3.d = true;
                hr hrVar = bVar3.f16654c;
                if (hrVar != null) {
                    hrVar.setReverse(true);
                }
            }
            addView(bVar3, kb1.i(i11, i11 + 8, this.f17050r));
            cVarArr[i10] = new k6.c(bVar3, bVar, bVar2, 2);
            ag.g gVar = this.f17048f[i10];
            if (gVar != null) {
                bVar3.a(gVar.f1279a, false);
                bVar.a(false, false);
                if (gVar.f1279a <= 0) {
                    z12 = false;
                }
                bVar2.a(z12, false);
                bVar3.c(gVar.f1280b, false);
                bVar3.b(gVar.f1281c, false);
            }
            a();
        }
        ((oe.b) cVarArr[i10].f16406c).a(z10, z11);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public void setGravity(int i10) {
        this.f17050r = i10;
    }

    public void setOnClickListener(a aVar) {
        this.h = aVar;
    }

    public void setOnLongClickListener(b bVar) {
        this.f17049n = bVar;
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
