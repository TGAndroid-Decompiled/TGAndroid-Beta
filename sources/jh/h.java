package jh;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import b2.n1;
import ci.o4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.wq;
import w7.x5;
import w7.z5;
public final class h extends FrameLayout implements le.d {
    public static final int[] f13035s;
    public final String[] f13036a;
    public final f6 f13037b;
    public final dh.a f13038c;
    public final ah.c d;
    public final aa.a[] e;
    public final n1[] f13039f;
    public a h;
    public b f13040n;
    public int f13041r;

    static {
        int i10 = R.drawable.msg_input_attach2;
        int i11 = R.drawable.pagedown;
        f13035s = new int[]{i10, i11, R.drawable.mentionbutton, R.drawable.reactionbutton, R.drawable.menu_poll_notify, i11, i11};
    }

    public h(Context context, f6 f6Var, dh.b bVar, ah.c cVar) {
        super(context);
        this.f13036a = new String[]{LocaleController.getString(R.string.AttachMenu), LocaleController.getString(R.string.AccDescrPageDown), LocaleController.getString(R.string.AccDescrMentionDown), LocaleController.getString(R.string.AccDescrReactionMentionDown), LocaleController.getString(R.string.AccDescrPollVotesMentionDown), LocaleController.getString(R.string.AccDescrSearchPrev), LocaleController.getString(R.string.AccDescrSearchNext)};
        this.e = new aa.a[7];
        this.f13039f = new n1[7];
        this.f13041r = 83;
        this.d = cVar;
        this.f13038c = bVar;
        this.f13037b = f6Var;
    }

    @Override
    public final void D(int i10, float f7, float f10, le.e eVar) {
        int i11 = i10 >> 16;
        int i12 = i10 & 65535;
        if (i11 >= 0) {
            aa.a[] aVarArr = this.e;
            if (i11 < aVarArr.length && aVarArr[i11] != null) {
                if (i12 == 1 || i12 == 2) {
                    a();
                }
            }
        }
    }

    public final void a() {
        int i10;
        int i11 = 0;
        float f7 = 0.0f;
        while (true) {
            aa.a[] aVarArr = this.e;
            if (i11 < aVarArr.length) {
                aa.a aVar = aVarArr[i11];
                if (aVar != null) {
                    ih.b bVar = (ih.b) aVar.f359b;
                    float f10 = ((le.b) aVar.f360c).e;
                    float f11 = ((le.b) aVar.d).e;
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

    public final n1 b(int i10) {
        n1[] n1VarArr = this.f13039f;
        if (n1VarArr[i10] == 0) {
            ?? obj = new Object();
            obj.f3164a = 0;
            obj.f3165b = false;
            obj.f3166c = true;
            n1VarArr[i10] = obj;
        }
        return n1VarArr[i10];
    }

    public final void c(int i10, int i11, boolean z10) {
        boolean z11;
        b(i10).f3164a = i11;
        aa.a aVar = this.e[i10];
        if (aVar != null) {
            ((ih.b) aVar.f359b).a(i11, z10);
            le.b bVar = (le.b) aVar.d;
            if (i11 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            bVar.a(z11, z10);
        }
    }

    public final void d(boolean z10) {
        b(1).f3165b = z10;
        aa.a aVar = this.e[1];
        if (aVar != null) {
            ((ih.b) aVar.f359b).c(z10, true);
        }
    }

    public final void e(int i10, boolean z10, boolean z11) {
        Interpolator interpolator;
        long j3;
        Interpolator interpolator2;
        long j10;
        int i11;
        int i12;
        aa.a[] aVarArr = this.e;
        aa.a aVar = aVarArr[i10];
        if (aVar == null && !z10) {
            return;
        }
        if (aVar == null) {
            int i13 = i10 << 16;
            int i14 = i13 | 1;
            if (i10 == 0) {
                interpolator = qr.h;
            } else {
                interpolator = ke.a.f13590a;
            }
            if (i10 == 0) {
                j3 = 300;
            } else {
                j3 = 280;
            }
            le.b bVar = new le.b(i14, this, interpolator, j3, false);
            int i15 = i13 | 2;
            if (i10 == 0) {
                interpolator2 = qr.h;
            } else {
                interpolator2 = ke.a.f13590a;
            }
            Interpolator interpolator3 = interpolator2;
            if (i10 == 0) {
                j10 = 300;
            } else {
                j10 = 280;
            }
            le.b bVar2 = new le.b(i15, this, interpolator3, j10, false);
            if (i10 == 0) {
                i11 = 50;
                i12 = 32;
            } else {
                i11 = 56;
                i12 = 48;
            }
            Context context = getContext();
            int i16 = f13035s[i10];
            f6 f6Var = this.f13037b;
            ih.b bVar3 = new ih.b(context, f6Var);
            ih.a d = ih.a.d(context, this.d, this.f13038c, f6Var, i16, i12);
            bVar3.f11200b = d;
            bVar3.addView(d, x5.e(i11, i11, 80));
            d.setIconPadding(AndroidUtilities.dp(2.0f));
            z5.b(bVar3, 0.13f, 2.0f);
            float f7 = i11 / 2.0f;
            bVar3.setPivotX(AndroidUtilities.dp(f7));
            bVar3.setPivotY(AndroidUtilities.dp(f7 + 8.0f));
            bVar3.setVisibility(8);
            bVar3.setContentDescription(this.f13036a[i10]);
            bVar3.setOnClickListener(new o4(this, i10, 4));
            bVar3.setOnLongClickListener(new g(this, i10, 0));
            if (i10 == 6) {
                ih.a aVar2 = bVar3.f11200b;
                aVar2.h = -1.0f;
                aVar2.a();
            }
            boolean z12 = true;
            if (i10 == 1) {
                bVar3.d = true;
                wq wqVar = bVar3.f11201c;
                if (wqVar != null) {
                    wqVar.setReverse(true);
                }
            }
            addView(bVar3, x5.e(i11, i11 + 8, this.f13041r));
            aVarArr[i10] = new aa.a(bVar3, bVar, bVar2, false, 24);
            n1 n1Var = this.f13039f[i10];
            if (n1Var != null) {
                bVar3.a(n1Var.f3164a, false);
                bVar.a(false, false);
                if (n1Var.f3164a <= 0) {
                    z12 = false;
                }
                bVar2.a(z12, false);
                bVar3.c(n1Var.f3165b, false);
                bVar3.b(n1Var.f3166c, false);
            }
            a();
        }
        ((le.b) aVarArr[i10].f360c).a(z10, z11);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public void setGravity(int i10) {
        this.f13041r = i10;
    }

    public void setOnClickListener(a aVar) {
        this.h = aVar;
    }

    public void setOnLongClickListener(b bVar) {
        this.f13040n = bVar;
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
