package kh;

import af.l;
import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import di.m4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.jr;
import w7.a6;
public final class h extends FrameLayout implements ne.d {
    public static final int[] f14283s;
    public final String[] f14284a;
    public final c6 f14285b;
    public final eh.a f14286c;
    public final bh.b d;
    public final androidx.biometric.e[] e;
    public final l[] f14287f;
    public a h;
    public b f14288n;
    public int f14289r;

    static {
        int i10 = R.drawable.msg_input_attach2;
        int i11 = R.drawable.pagedown;
        f14283s = new int[]{i10, i11, R.drawable.mentionbutton, R.drawable.reactionbutton, R.drawable.menu_poll_notify, i11, i11};
    }

    public h(Context context, c6 c6Var, eh.b bVar, bh.b bVar2) {
        super(context);
        this.f14284a = new String[]{LocaleController.getString(R.string.AttachMenu), LocaleController.getString(R.string.AccDescrPageDown), LocaleController.getString(R.string.AccDescrMentionDown), LocaleController.getString(R.string.AccDescrReactionMentionDown), LocaleController.getString(R.string.AccDescrPollVotesMentionDown), LocaleController.getString(R.string.AccDescrSearchPrev), LocaleController.getString(R.string.AccDescrSearchNext)};
        this.e = new androidx.biometric.e[7];
        this.f14287f = new l[7];
        this.f14289r = 83;
        this.d = bVar2;
        this.f14286c = bVar;
        this.f14285b = c6Var;
    }

    public final void a() {
        int i10;
        float f7 = 0.0f;
        int i11 = 0;
        while (true) {
            androidx.biometric.e[] eVarArr = this.e;
            if (i11 < eVarArr.length) {
                androidx.biometric.e eVar = eVarArr[i11];
                if (eVar != null) {
                    jh.b bVar = (jh.b) eVar.f1196b;
                    float f10 = ((ne.b) eVar.f1197c).e;
                    float f11 = ((ne.b) eVar.d).e;
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

    public final l b(int i10) {
        l[] lVarArr = this.f14287f;
        if (lVarArr[i10] == 0) {
            ?? obj = new Object();
            obj.f588a = 0;
            obj.f589b = false;
            obj.f590c = true;
            lVarArr[i10] = obj;
        }
        return lVarArr[i10];
    }

    public final void c(int i10, int i11, boolean z10) {
        boolean z11;
        b(i10).f588a = i11;
        androidx.biometric.e eVar = this.e[i10];
        if (eVar != null) {
            ((jh.b) eVar.f1196b).a(i11, z10);
            ne.b bVar = (ne.b) eVar.d;
            if (i11 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            bVar.a(z11, z10);
        }
    }

    public final void d(boolean z10) {
        b(1).f589b = z10;
        androidx.biometric.e eVar = this.e[1];
        if (eVar != null) {
            ((jh.b) eVar.f1196b).c(z10, true);
        }
    }

    public final void e(int i10, boolean z10, boolean z11) {
        Interpolator interpolator;
        long j10;
        Interpolator interpolator2;
        long j11;
        int i11;
        int i12;
        androidx.biometric.e[] eVarArr = this.e;
        androidx.biometric.e eVar = eVarArr[i10];
        if (eVar == null && !z10) {
            return;
        }
        if (eVar == null) {
            int i13 = i10 << 16;
            int i14 = i13 | 1;
            if (i10 == 0) {
                interpolator = es.h;
            } else {
                interpolator = me.a.f15760a;
            }
            if (i10 == 0) {
                j10 = 300;
            } else {
                j10 = 280;
            }
            ne.b bVar = new ne.b(i14, this, interpolator, j10, false);
            int i15 = i13 | 2;
            if (i10 == 0) {
                interpolator2 = es.h;
            } else {
                interpolator2 = me.a.f15760a;
            }
            Interpolator interpolator3 = interpolator2;
            if (i10 == 0) {
                j11 = 300;
            } else {
                j11 = 280;
            }
            ne.b bVar2 = new ne.b(i15, this, interpolator3, j11, false);
            if (i10 == 0) {
                i11 = 50;
                i12 = 32;
            } else {
                i11 = 56;
                i12 = 48;
            }
            int i16 = i12;
            Context context = getContext();
            int i17 = f14283s[i10];
            c6 c6Var = this.f14285b;
            jh.b bVar3 = new jh.b(context, c6Var);
            jh.a d = jh.a.d(context, this.d, this.f14286c, c6Var, i17, i16);
            bVar3.f13099b = d;
            bVar3.addView(d, a6.e(i11, i11, 80));
            d.setIconPadding(AndroidUtilities.dp(2.0f));
            w7.c6.b(bVar3, 0.13f, 2.0f);
            float f7 = i11 / 2.0f;
            bVar3.setPivotX(AndroidUtilities.dp(f7));
            bVar3.setPivotY(AndroidUtilities.dp(f7 + 8.0f));
            bVar3.setVisibility(8);
            bVar3.setContentDescription(this.f14284a[i10]);
            bVar3.setOnClickListener(new m4(this, i10, 4));
            bVar3.setOnLongClickListener(new g(this, i10, 0));
            if (i10 == 6) {
                jh.a aVar = bVar3.f13099b;
                aVar.h = -1.0f;
                aVar.a();
            }
            boolean z12 = true;
            if (i10 == 1) {
                bVar3.d = true;
                jr jrVar = bVar3.f13100c;
                if (jrVar != null) {
                    jrVar.setReverse(true);
                }
            }
            addView(bVar3, a6.e(i11, i11 + 8, this.f14289r));
            eVarArr[i10] = new androidx.biometric.e(bVar3, bVar, bVar2, 27);
            l lVar = this.f14287f[i10];
            if (lVar != null) {
                bVar3.a(lVar.f588a, false);
                bVar.a(false, false);
                if (lVar.f588a <= 0) {
                    z12 = false;
                }
                bVar2.a(z12, false);
                bVar3.c(lVar.f589b, false);
                bVar3.b(lVar.f590c, false);
            }
            a();
        }
        ((ne.b) eVarArr[i10].f1197c).a(z10, z11);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        int i11 = i10 >> 16;
        int i12 = i10 & 65535;
        if (i11 >= 0) {
            androidx.biometric.e[] eVarArr = this.e;
            if (i11 < eVarArr.length && eVarArr[i11] != null) {
                if (i12 == 1 || i12 == 2) {
                    a();
                }
            }
        }
    }

    public void setGravity(int i10) {
        this.f14289r = i10;
    }

    public void setOnClickListener(a aVar) {
        this.h = aVar;
    }

    public void setOnLongClickListener(b bVar) {
        this.f14288n = bVar;
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
