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
public final class lj6 extends FrameLayout implements snb {
    public TLRPC.FileLocation E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final byte K;
    public int L;
    public kj6 M;
    public final int N;
    public final q6b O;
    public boolean P;
    public final jj6 a;
    public final ema b;
    public final ema c;
    public final vnb d;
    public final rb0 e;
    public final ImageView f;
    public ImageView h;
    public TLObject n;
    public TL_stories.StoryItem r;
    public CharSequence s;
    public CharSequence w;
    public String x;
    public int y;

    public lj6(Context context, int i, int i2, boolean z, vnb vnbVar) {
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
        this.N = yac.t0;
        this.O = new q6b(null, false);
        this.d = vnbVar;
        this.I = aob.v0(aob.y6, vnbVar);
        this.J = aob.v0(aob.n6, vnbVar);
        this.K = i2;
        this.e = new rb0((vnb) null);
        jj6 jj6Var = new jj6(this, context, vnbVar);
        this.a = jj6Var;
        jj6Var.setRoundRadius(hl.L(23.0f));
        boolean z2 = ob6.a0;
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
        addView(jj6Var, tre.d(46, 46.0f, i8, f, 8.0f, z2 ? i + 7 : 0.0f, 0.0f));
        ema emaVar = new ema(context);
        this.b = emaVar;
        yob.W(emaVar, aob.G6, vnbVar);
        emaVar.setTextSize(17);
        emaVar.setTypeface(hl.o());
        if (ob6.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        emaVar.setGravity(i4 | 48);
        boolean z3 = ob6.a0;
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
        addView(emaVar, tre.d(-1, 20.0f, i9, f2, 11.5f, z3 ? i2 + 68 : 46.0f, 0.0f));
        jn7.i(emaVar);
        ema emaVar2 = new ema(context);
        this.c = emaVar2;
        emaVar2.setTextSize(14);
        if (ob6.a0) {
            i6 = 5;
        } else {
            i6 = 3;
        }
        emaVar2.setGravity(i6 | 48);
        boolean z4 = ob6.a0;
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
        addView(emaVar2, tre.d(-1, 20.0f, i10, f3, 34.5f, z4 ? i2 + 68 : 28.0f, 0.0f));
        if (z) {
            ImageView imageView = new ImageView(context);
            this.f = imageView;
            imageView.setFocusable(false);
            int i11 = aob.Mi;
            hf0 f0 = aob.f0(aob.v0(i11, vnbVar), 1, -1);
            uob M = yob.M(i11);
            imageView.setBackground(f0);
            yob.j(imageView, f0, null, M, vnbVar);
            imageView.setImageResource(2131231247);
            yob.s(imageView, aob.Li, vnbVar, PorterDuff.Mode.MULTIPLY);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, tre.e(60, 64, (ob6.a0 ? 3 : 5) | 48));
            imageView.setOnClickListener(new sa5(this, (byte) 24));
            imageView.setContentDescription(ob6.M0(2131754735, null));
        }
    }

    public final void a() {
        this.a.getImageReceiver().c();
    }

    public final void b() {
        if (!this.P) {
            int i = aob.y6;
            vnb vnbVar = this.d;
            int v0 = aob.v0(i, vnbVar);
            int v02 = aob.v0(aob.n6, vnbVar);
            if (v0 == this.I && v02 == this.J) {
                return;
            }
            ema emaVar = this.c;
            if (emaVar != null) {
                int textColor = emaVar.getTextColor();
                if (textColor == this.I) {
                    emaVar.setTextColor(v0);
                } else if (textColor == this.J) {
                    emaVar.setTextColor(v02);
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
        ema emaVar = this.c;
        ema emaVar2 = this.b;
        if (tLObject == null) {
            this.w = null;
            this.s = null;
            this.n = null;
            emaVar2.l("", false);
            emaVar.l("", false);
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
            boolean z3 = ob6.a0;
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
            if (ob6.a0) {
                i8 = b + 68;
            } else if (a) {
                i8 = 46;
            } else {
                i8 = 28;
            }
            emaVar2.setLayoutParams(tre.d(-1, 20.0f, i12, f5, f3, i8, 0.0f));
            boolean z4 = ob6.a0;
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
            emaVar.setLayoutParams(tre.d(-1, 20.0f, i13, f6, 34.5f, f4, 0.0f));
        } else {
            ImageView imageView2 = this.h;
            if (imageView2 != null) {
                if (imageView2.getVisibility() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z5 = ob6.a0;
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
                if (ob6.a0) {
                    i3 = b + 68;
                } else if (z2) {
                    i3 = 54;
                } else {
                    i3 = 28;
                }
                emaVar2.setLayoutParams(tre.d(-1, 20.0f, i14, f7, f, i3, 0.0f));
                boolean z6 = ob6.a0;
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
                emaVar.setLayoutParams(tre.d(-1, 20.0f, i15, f8, 34.5f, f2, 0.0f));
            }
        }
        this.G = z;
        setWillNotDraw(true ^ z);
        d(0);
    }

    public final void d(int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lj6.d(int):void");
    }

    public de0 getAvatarImageView() {
        return this.a;
    }

    public Object getCurrentObject() {
        return this.n;
    }

    public q6b getStoryAvatarParams() {
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
                aob.k0.setColor(aob.v0(i2, this.d));
            }
            if (ob6.a0) {
                L = 0.0f;
            } else {
                L = hl.L(68.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (ob6.a0) {
                i = hl.L(68.0f);
            } else {
                i = 0;
            }
            float f2 = measuredWidth - i;
            float measuredHeight2 = getMeasuredHeight() - 1;
            if (this.L >= 0) {
                paint = aob.k0;
            } else {
                paint = aob.j0;
            }
            canvas.drawLine(f, measuredHeight, f2, measuredHeight2, paint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(64.0f) + (this.G ? 1 : 0), 1073741824));
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
        yob.s(this.h, aob.dh, this.d, PorterDuff.Mode.MULTIPLY);
        ImageView imageView2 = this.h;
        if (ob6.a0) {
            i2 = 3;
        } else {
            i2 = 5;
        }
        addView(imageView2, tre.e(52, 64, i2 | 48));
    }

    public void setDelegate(kj6 kj6Var) {
        this.M = kj6Var;
    }

    public void setDividerColor(int i) {
        this.L = i;
    }

    public void setIsAdmin(boolean z) {
        this.F = z;
    }

    public void setNameColor(int i) {
        ema emaVar = this.b;
        yob.q(emaVar);
        emaVar.setTextColor(i);
    }

    @Override
    public final void updateColors() {
        try {
            b();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
