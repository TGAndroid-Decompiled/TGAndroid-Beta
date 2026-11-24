package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class gh6 extends FrameLayout implements tjb {
    public TLRPC.FileLocation E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final byte K;
    public int L;
    public fh6 M;
    public final int N;
    public final u2b O;
    public boolean P;
    public final eh6 a;
    public final jia b;
    public final jia c;
    public final wjb d;
    public final pb0 e;
    public final ImageView f;
    public ImageView h;
    public TLObject n;
    public TL_stories.StoryItem r;
    public CharSequence s;
    public CharSequence w;
    public String x;
    public int y;

    public gh6(Context context, int i, int i2, boolean z, wjb wjbVar) {
        super(context);
        int i3;
        float f;
        int i4;
        int i5;
        float f2;
        int i6;
        int i7;
        float f3;
        this.L = -1;
        this.N = y6c.t0;
        this.O = new u2b(null, false);
        this.d = wjbVar;
        this.I = bkb.v0(bkb.x6, wjbVar);
        this.J = bkb.v0(bkb.m6, wjbVar);
        this.K = i2;
        this.e = new pb0((wjb) null);
        eh6 eh6Var = new eh6(this, context, wjbVar);
        this.a = eh6Var;
        eh6Var.setRoundRadius(gl.L(23.0f));
        boolean z2 = k96.a0;
        if (z2) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        int i8 = i3 | 48;
        if (z2) {
            f = 0.0f;
        } else {
            f = i + 7;
        }
        addView(eh6Var, nme.d(46, 46.0f, i8, f, 8.0f, z2 ? i + 7 : 0.0f, 0.0f));
        jia jiaVar = new jia(context);
        this.b = jiaVar;
        zkb.W(jiaVar, bkb.F6, wjbVar);
        jiaVar.setTextSize(17);
        jiaVar.setTypeface(gl.o());
        if (k96.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        jiaVar.setGravity(i4 | 48);
        boolean z3 = k96.a0;
        if (z3) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        int i9 = i5 | 48;
        if (z3) {
            f2 = 46.0f;
        } else {
            f2 = i2 + 68;
        }
        addView(jiaVar, nme.d(-1, 20.0f, i9, f2, 11.5f, z3 ? i2 + 68 : 46.0f, 0.0f));
        kk7.i(jiaVar);
        jia jiaVar2 = new jia(context);
        this.c = jiaVar2;
        jiaVar2.setTextSize(14);
        if (k96.a0) {
            i6 = 5;
        } else {
            i6 = 3;
        }
        jiaVar2.setGravity(i6 | 48);
        boolean z4 = k96.a0;
        if (z4) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        int i10 = i7 | 48;
        if (z4) {
            f3 = 28.0f;
        } else {
            f3 = i2 + 68;
        }
        addView(jiaVar2, nme.d(-1, 20.0f, i10, f3, 34.5f, z4 ? i2 + 68 : 28.0f, 0.0f));
        if (z) {
            ImageView imageView = new ImageView(context);
            this.f = imageView;
            imageView.setFocusable(false);
            int i11 = bkb.Li;
            ff0 f0 = bkb.f0(bkb.v0(i11, wjbVar), 1, -1);
            vkb M = zkb.M(i11);
            imageView.setBackground(f0);
            zkb.j(imageView, f0, null, M, wjbVar);
            imageView.setImageResource(2131231247);
            zkb.s(imageView, bkb.Ki, wjbVar, PorterDuff.Mode.MULTIPLY);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, nme.e(60, 64, (k96.a0 ? 3 : 5) | 48));
            imageView.setOnClickListener(new b95(this, (byte) 23));
            imageView.setContentDescription(k96.M0(2131754739, null));
        }
    }

    public final void a() {
        this.a.getImageReceiver().c();
    }

    public final void b() {
        if (!this.P) {
            int i = bkb.x6;
            wjb wjbVar = this.d;
            int v0 = bkb.v0(i, wjbVar);
            int v02 = bkb.v0(bkb.m6, wjbVar);
            if (v0 == this.I && v02 == this.J) {
                return;
            }
            jia jiaVar = this.c;
            if (jiaVar != null) {
                int textColor = jiaVar.getTextColor();
                if (textColor == this.I) {
                    jiaVar.setTextColor(v0);
                } else if (textColor == this.J) {
                    jiaVar.setTextColor(v02);
                }
            }
            this.I = v0;
            this.J = v02;
        }
    }

    public final void c(TLObject tLObject, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        boolean z2;
        int i;
        int i2;
        float f;
        int i3;
        int i4;
        float f2;
        int i5;
        int i6;
        int i7;
        float f3;
        int i8;
        int i9;
        float f4;
        jia jiaVar = this.c;
        jia jiaVar2 = this.b;
        if (tLObject == null) {
            this.w = null;
            this.s = null;
            this.n = null;
            jiaVar2.l("", false);
            jiaVar.l("", false);
            this.a.setImageDrawable(null);
            return;
        }
        this.w = charSequence2;
        this.s = charSequence;
        this.n = tLObject;
        ImageView imageView = this.f;
        int i10 = 3;
        byte b = this.K;
        int i11 = 28;
        if (imageView != null) {
            boolean a = this.M.a(this, false);
            if (a) {
                i5 = 0;
            } else {
                i5 = 4;
            }
            imageView.setVisibility(i5);
            boolean z3 = k96.a0;
            if (z3) {
                i6 = 5;
            } else {
                i6 = 3;
            }
            int i12 = i6 | 48;
            if (z3) {
                if (a) {
                    i7 = 46;
                } else {
                    i7 = 28;
                }
            } else {
                i7 = b + 68;
            }
            float f5 = i7;
            if (charSequence2 != null && charSequence2.length() <= 0) {
                f3 = 20.5f;
            } else {
                f3 = 11.5f;
            }
            if (k96.a0) {
                i8 = b + 68;
            } else if (a) {
                i8 = 46;
            } else {
                i8 = 28;
            }
            jiaVar2.setLayoutParams(nme.d(-1, 20.0f, i12, f5, f3, i8, 0.0f));
            boolean z4 = k96.a0;
            if (z4) {
                i10 = 5;
            }
            int i13 = i10 | 48;
            if (z4) {
                if (a) {
                    i9 = 46;
                } else {
                    i9 = 28;
                }
            } else {
                i9 = b + 68;
            }
            float f6 = i9;
            if (z4) {
                f4 = b + 68;
            } else {
                if (a) {
                    i11 = 46;
                }
                f4 = i11;
            }
            jiaVar.setLayoutParams(nme.d(-1, 20.0f, i13, f6, 34.5f, f4, 0.0f));
        } else {
            ImageView imageView2 = this.h;
            if (imageView2 != null) {
                if (imageView2.getVisibility() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z5 = k96.a0;
                if (z5) {
                    i = 5;
                } else {
                    i = 3;
                }
                int i14 = i | 48;
                if (z5) {
                    if (z2) {
                        i2 = 54;
                    } else {
                        i2 = 28;
                    }
                } else {
                    i2 = b + 68;
                }
                float f7 = i2;
                if (charSequence2 != null && charSequence2.length() <= 0) {
                    f = 20.5f;
                } else {
                    f = 11.5f;
                }
                if (k96.a0) {
                    i3 = b + 68;
                } else if (z2) {
                    i3 = 54;
                } else {
                    i3 = 28;
                }
                jiaVar2.setLayoutParams(nme.d(-1, 20.0f, i14, f7, f, i3, 0.0f));
                boolean z6 = k96.a0;
                if (z6) {
                    i10 = 5;
                }
                int i15 = i10 | 48;
                if (z6) {
                    if (z2) {
                        i4 = 54;
                    } else {
                        i4 = 28;
                    }
                } else {
                    i4 = b + 68;
                }
                float f8 = i4;
                if (z6) {
                    f2 = b + 68;
                } else {
                    if (z2) {
                        i11 = 54;
                    }
                    f2 = i11;
                }
                jiaVar.setLayoutParams(nme.d(-1, 20.0f, i15, f8, 34.5f, f2, 0.0f));
            }
        }
        this.G = z;
        setWillNotDraw(true ^ z);
        d(0);
    }

    public final void d(int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh6.d(int):void");
    }

    public be0 getAvatarImageView() {
        return this.a;
    }

    public Object getCurrentObject() {
        return this.n;
    }

    public u2b getStoryAvatarParams() {
        return this.O;
    }

    public TL_stories.StoryItem getStoryItem() {
        return this.r;
    }

    public long getUserId() {
        TLObject tLObject = this.n;
        if (tLObject instanceof TLRPC.User) {
            return ((TLRPC.User) tLObject).id;
        }
        return 0L;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        Paint paint;
        if (this.G) {
            int i2 = this.L;
            if (i2 >= 0) {
                bkb.k0.setColor(bkb.v0(i2, this.d));
            }
            if (k96.a0) {
                L = 0.0f;
            } else {
                L = gl.L(68.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (k96.a0) {
                i = gl.L(68.0f);
            } else {
                i = 0;
            }
            float f2 = measuredWidth - i;
            float measuredHeight2 = getMeasuredHeight() - 1;
            if (this.L >= 0) {
                paint = bkb.k0;
            } else {
                paint = bkb.j0;
            }
            canvas.drawLine(f, measuredHeight, f2, measuredHeight2, paint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(64.0f) + (this.G ? 1 : 0), 1073741824));
    }

    public void setCustomImageVisible(boolean z) {
        int i;
        ImageView imageView = this.h;
        if (imageView == null) {
            return;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    public void setCustomRightImage(int i) {
        int i2;
        ImageView imageView = new ImageView(getContext());
        this.h = imageView;
        imageView.setImageResource(i);
        this.h.setScaleType(ImageView.ScaleType.CENTER);
        zkb.s(this.h, bkb.ch, this.d, PorterDuff.Mode.MULTIPLY);
        ImageView imageView2 = this.h;
        if (k96.a0) {
            i2 = 3;
        } else {
            i2 = 5;
        }
        addView(imageView2, nme.e(52, 64, i2 | 48));
    }

    public void setDelegate(fh6 fh6Var) {
        this.M = fh6Var;
    }

    public void setDividerColor(int i) {
        this.L = i;
    }

    public void setIsAdmin(boolean z) {
        this.F = z;
    }

    public void setNameColor(int i) {
        jia jiaVar = this.b;
        zkb.q(jiaVar);
        jiaVar.setTextColor(i);
    }

    @Override
    public final void updateColors() {
        try {
            b();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
