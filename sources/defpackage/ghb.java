package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public class ghb extends FrameLayout implements tjb {
    public final wla a;
    public final fhb b;
    public final fhb c;
    public final ImageView d;
    public boolean e;
    public boolean f;
    public final boolean h;
    public final wjb n;

    public ghb(int i, wjb wjbVar, Context context, boolean z, boolean z2) {
        super(context);
        boolean z3;
        int i2;
        int i3;
        float f;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        this.n = wjbVar;
        if (!z && !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.h = z3;
        wla wlaVar = new wla(wjbVar, context, true);
        this.a = wlaVar;
        wlaVar.setOnLinkLongPressListener(new k46(this) {
            public final ghb b;

            {
                this.b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                byte b = r2;
                ghb ghbVar = this.b;
                switch (b) {
                    case 0:
                        if (clickableSpan != null) {
                            try {
                                ghbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(ghbVar.a);
                            return;
                        }
                        return;
                    case 1:
                        if (clickableSpan != null) {
                            try {
                                ghbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(ghbVar.b);
                            return;
                        }
                        return;
                    default:
                        if (clickableSpan != null) {
                            try {
                                ghbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(ghbVar.b);
                            return;
                        }
                        return;
                }
            }
        });
        wlaVar.setTextSize(1, 16.0f);
        if (k96.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        wlaVar.setGravity(i2);
        if (z) {
            setMinimumHeight(gl.L(60.0f));
        } else {
            wlaVar.setLines(1);
            wlaVar.setMaxLines(1);
            wlaVar.setSingleLine(true);
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        wlaVar.setEllipsize(truncateAt);
        wlaVar.setImportantForAccessibility(2);
        wlaVar.setPadding(gl.L(6.0f), gl.L(2.0f), gl.L(6.0f), gl.L(5.0f));
        if (k96.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        float f2 = i - 6;
        if (z) {
            f = 27.0f;
        } else {
            f = 0.0f;
        }
        addView(wlaVar, nme.d(-2, -2.0f, i3, f2, 6.0f, f2, f));
        fhb fhbVar = new fhb(this, context, wjbVar, (byte) 0);
        this.b = fhbVar;
        fhbVar.setOnLinkLongPressListener(new k46(this) {
            public final ghb b;

            {
                this.b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                byte b = r2;
                ghb ghbVar = this.b;
                switch (b) {
                    case 0:
                        if (clickableSpan != null) {
                            try {
                                ghbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(ghbVar.a);
                            return;
                        }
                        return;
                    case 1:
                        if (clickableSpan != null) {
                            try {
                                ghbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(ghbVar.b);
                            return;
                        }
                        return;
                    default:
                        if (clickableSpan != null) {
                            try {
                                ghbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(ghbVar.b);
                            return;
                        }
                        return;
                }
            }
        });
        if (z2) {
            setMinimumHeight(gl.L(60.0f));
        } else {
            fhbVar.setLines(1);
            fhbVar.setSingleLine(true);
        }
        fhbVar.setTextSize(1, 13.0f);
        if (k96.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        fhbVar.setGravity(i4);
        fhbVar.setImportantForAccessibility(2);
        fhbVar.setEllipsize(truncateAt);
        fhbVar.setPadding(0, gl.L(1.0f), 0, gl.L(6.0f));
        boolean z4 = k96.a0;
        if (z) {
            if (z4) {
                i9 = 5;
            } else {
                i9 = 3;
            }
            int i10 = i9 | 80;
            float f3 = i;
            addView(fhbVar, nme.d(-1, -2.0f, i10, f3, 32.0f, f3, 4.0f));
        } else {
            if (z4) {
                i5 = 5;
            } else {
                i5 = 3;
            }
            float f4 = i;
            addView(fhbVar, nme.d(-1, -2.0f, i5, f4, 32.0f, f4, 4.0f));
        }
        fhb fhbVar2 = new fhb(this, context, wjbVar, (byte) 1);
        this.c = fhbVar2;
        fhbVar2.setOnLinkLongPressListener(new k46(this) {
            public final ghb b;

            {
                this.b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                byte b = r2;
                ghb ghbVar = this.b;
                switch (b) {
                    case 0:
                        if (clickableSpan != null) {
                            try {
                                ghbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(ghbVar.a);
                            return;
                        }
                        return;
                    case 1:
                        if (clickableSpan != null) {
                            try {
                                ghbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(ghbVar.b);
                            return;
                        }
                        return;
                    default:
                        if (clickableSpan != null) {
                            try {
                                ghbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(ghbVar.b);
                            return;
                        }
                        return;
                }
            }
        });
        this.h = z3;
        if (z3) {
            setMinimumHeight(gl.L(60.0f));
        } else {
            fhbVar2.setLines(1);
            fhbVar2.setSingleLine(true);
        }
        fhbVar2.setTextSize(1, 13.0f);
        if (k96.a0) {
            i6 = 3;
        } else {
            i6 = 5;
        }
        fhbVar2.setGravity(i6);
        fhbVar2.setImportantForAccessibility(2);
        fhbVar2.setEllipsize(truncateAt);
        fhbVar2.setPadding(0, gl.L(1.0f), 0, gl.L(6.0f));
        boolean z5 = k96.a0;
        if (z) {
            if (z5) {
                i8 = 5;
            } else {
                i8 = 3;
            }
            float f5 = i;
            addView(fhbVar2, nme.d(-1, -2.0f, i8 | 80, f5, 32.0f, f5, 4.0f));
        } else {
            if (z5) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            float f6 = i;
            addView(fhbVar2, nme.d(-1, -2.0f, i7, f6, 32.0f, f6, 4.0f));
        }
        updateColors();
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, nme.i(48.0f, 48.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    public final void b(Drawable drawable, String str) {
        int L;
        boolean z;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
        if (!k96.a0 && drawable != null) {
            L = gl.L(58.0f);
        } else {
            L = gl.L(23.0f);
        }
        marginLayoutParams.rightMargin = L;
        ImageView imageView = this.d;
        imageView.setImageDrawable(drawable);
        int i = 0;
        if (drawable != null) {
            z = true;
        } else {
            z = false;
        }
        imageView.setFocusable(z);
        imageView.setContentDescription(str);
        if (drawable == null) {
            imageView.setBackground(null);
            imageView.setImportantForAccessibility(2);
        } else {
            int L2 = gl.L(48.0f);
            int i2 = bkb.h6;
            wjb wjbVar = this.n;
            ff0 h0 = bkb.h0(L2, 0, bkb.v0(i2, wjbVar));
            vkb M = zkb.M(i2);
            imageView.setBackground(h0);
            zkb.j(imageView, h0, null, M, wjbVar);
            imageView.setImportantForAccessibility(1);
        }
        int L3 = gl.L(23.0f);
        if (drawable != null) {
            i = gl.L(48.0f);
        }
        int i3 = L3 + i;
        boolean z2 = k96.a0;
        wla wlaVar = this.a;
        if (z2) {
            ((ViewGroup.MarginLayoutParams) wlaVar.getLayoutParams()).leftMargin = i3;
        } else {
            ((ViewGroup.MarginLayoutParams) wlaVar.getLayoutParams()).rightMargin = i3;
        }
        wlaVar.requestLayout();
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        this.a.setText(charSequence);
        this.b.setText(charSequence2);
        this.c.setVisibility(8);
        this.e = z;
        setWillNotDraw(!z);
    }

    public final void d(CharSequence charSequence, String str, String str2) {
        this.a.setText(charSequence);
        this.b.setText(str);
        fhb fhbVar = this.c;
        fhbVar.setVisibility(0);
        fhbVar.setText(str2);
        this.e = false;
        setWillNotDraw(true);
    }

    public ImageView getImageView() {
        return this.d;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        float L;
        int i;
        if (this.e) {
            wjb wjbVar = this.n;
            if (wjbVar != null) {
                paint = wjbVar.d("paintDivider");
            } else {
                paint = bkb.j0;
            }
            if (paint == null) {
                paint = bkb.j0;
            }
            Paint paint2 = paint;
            if (k96.a0) {
                L = 0.0f;
            } else {
                L = gl.L(20.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (k96.a0) {
                i = gl.L(20.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence text = this.a.getText();
        CharSequence text2 = this.b.getText();
        if (!TextUtils.isEmpty(text) && !TextUtils.isEmpty(text2)) {
            StringBuilder sb = new StringBuilder();
            if (this.f) {
                charSequence = text2;
            } else {
                charSequence = text;
            }
            sb.append((Object) charSequence);
            sb.append(": ");
            if (!this.f) {
                text = text2;
            }
            sb.append((Object) text);
            accessibilityNodeInfo.setText(sb.toString());
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        if (!this.h) {
            i2 = View.MeasureSpec.makeMeasureSpec(gl.L(60.0f) + (this.e ? 1 : 0), 1073741824);
        }
        super.onMeasure(makeMeasureSpec, i2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        fhb fhbVar = this.b;
        ClickableSpan b = fhbVar.b(((int) motionEvent.getX()) - fhbVar.getLeft(), ((int) motionEvent.getY()) - fhbVar.getTop());
        boolean z2 = false;
        if (b != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            wla wlaVar = this.a;
            if (wlaVar.a(((int) motionEvent.getX()) - wlaVar.getLeft(), ((int) motionEvent.getY()) - wlaVar.getTop()) != null) {
                z2 = true;
            }
            z = z2;
        }
        if (z) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setContentDescriptionValueFirst(boolean z) {
        this.f = z;
    }

    public void setImage(Drawable drawable) {
        b(drawable, null);
    }

    public void setImageClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.d;
        imageView.setOnClickListener(onClickListener);
        if (onClickListener == null) {
            imageView.setClickable(false);
        }
    }

    @Override
    public final void updateColors() {
        int i = bkb.Wc;
        wjb wjbVar = this.n;
        int a = a(bkb.v0(i, wjbVar));
        wla wlaVar = this.a;
        wlaVar.setLinkTextColor(a);
        wlaVar.setTextColor(bkb.v0(bkb.F6, wjbVar));
        wlaVar.invalidate();
        int a2 = a(bkb.v0(i, wjbVar));
        fhb fhbVar = this.b;
        fhbVar.setLinkTextColor(a2);
        int i2 = bkb.y6;
        fhbVar.setTextColor(bkb.v0(i2, wjbVar));
        this.c.setTextColor(bkb.v0(i2, wjbVar));
        fhbVar.invalidate();
    }

    public int a(int i) {
        return i;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public ghb(wjb wjbVar, Context context, boolean z) {
        this(23, wjbVar, context, z, false);
    }
}
