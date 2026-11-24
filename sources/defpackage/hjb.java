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
public class hjb extends FrameLayout implements vlb {
    public final xna a;
    public final gjb b;
    public final gjb c;
    public final ImageView d;
    public boolean e;
    public boolean f;
    public final boolean h;
    public final ylb n;

    public hjb(int i, ylb ylbVar, Context context, boolean z, boolean z2) {
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
        this.n = ylbVar;
        if (!z && !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.h = z3;
        xna xnaVar = new xna(ylbVar, context, true);
        this.a = xnaVar;
        xnaVar.setOnLinkLongPressListener(new k66(this) {
            public final hjb b;

            {
                this.b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                byte b = r2;
                hjb hjbVar = this.b;
                switch (b) {
                    case 0:
                        if (clickableSpan != null) {
                            try {
                                hjbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(hjbVar.a);
                            return;
                        }
                        return;
                    case 1:
                        if (clickableSpan != null) {
                            try {
                                hjbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(hjbVar.b);
                            return;
                        }
                        return;
                    default:
                        if (clickableSpan != null) {
                            try {
                                hjbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(hjbVar.b);
                            return;
                        }
                        return;
                }
            }
        });
        xnaVar.setTextSize(1, 16.0f);
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        xnaVar.setGravity(i2);
        if (z) {
            setMinimumHeight(gm.L(60.0f));
        } else {
            xnaVar.setLines(1);
            xnaVar.setMaxLines(1);
            xnaVar.setSingleLine(true);
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        xnaVar.setEllipsize(truncateAt);
        xnaVar.setImportantForAccessibility(2);
        xnaVar.setPadding(gm.L(6.0f), gm.L(2.0f), gm.L(6.0f), gm.L(5.0f));
        if (jb6.a0) {
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
        addView(xnaVar, qoe.d(-2, -2.0f, i3, f2, 6.0f, f2, f));
        gjb gjbVar = new gjb(this, context, ylbVar, (byte) 0);
        this.b = gjbVar;
        gjbVar.setOnLinkLongPressListener(new k66(this) {
            public final hjb b;

            {
                this.b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                byte b = r2;
                hjb hjbVar = this.b;
                switch (b) {
                    case 0:
                        if (clickableSpan != null) {
                            try {
                                hjbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(hjbVar.a);
                            return;
                        }
                        return;
                    case 1:
                        if (clickableSpan != null) {
                            try {
                                hjbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(hjbVar.b);
                            return;
                        }
                        return;
                    default:
                        if (clickableSpan != null) {
                            try {
                                hjbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(hjbVar.b);
                            return;
                        }
                        return;
                }
            }
        });
        if (z2) {
            setMinimumHeight(gm.L(60.0f));
        } else {
            gjbVar.setLines(1);
            gjbVar.setSingleLine(true);
        }
        gjbVar.setTextSize(1, 13.0f);
        if (jb6.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        gjbVar.setGravity(i4);
        gjbVar.setImportantForAccessibility(2);
        gjbVar.setEllipsize(truncateAt);
        gjbVar.setPadding(0, gm.L(1.0f), 0, gm.L(6.0f));
        boolean z4 = jb6.a0;
        if (z) {
            if (z4) {
                i9 = 5;
            } else {
                i9 = 3;
            }
            int i10 = i9 | 80;
            float f3 = i;
            addView(gjbVar, qoe.d(-1, -2.0f, i10, f3, 32.0f, f3, 4.0f));
        } else {
            if (z4) {
                i5 = 5;
            } else {
                i5 = 3;
            }
            float f4 = i;
            addView(gjbVar, qoe.d(-1, -2.0f, i5, f4, 32.0f, f4, 4.0f));
        }
        gjb gjbVar2 = new gjb(this, context, ylbVar, (byte) 1);
        this.c = gjbVar2;
        gjbVar2.setOnLinkLongPressListener(new k66(this) {
            public final hjb b;

            {
                this.b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                byte b = r2;
                hjb hjbVar = this.b;
                switch (b) {
                    case 0:
                        if (clickableSpan != null) {
                            try {
                                hjbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(hjbVar.a);
                            return;
                        }
                        return;
                    case 1:
                        if (clickableSpan != null) {
                            try {
                                hjbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(hjbVar.b);
                            return;
                        }
                        return;
                    default:
                        if (clickableSpan != null) {
                            try {
                                hjbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(hjbVar.b);
                            return;
                        }
                        return;
                }
            }
        });
        this.h = z3;
        if (z3) {
            setMinimumHeight(gm.L(60.0f));
        } else {
            gjbVar2.setLines(1);
            gjbVar2.setSingleLine(true);
        }
        gjbVar2.setTextSize(1, 13.0f);
        if (jb6.a0) {
            i6 = 3;
        } else {
            i6 = 5;
        }
        gjbVar2.setGravity(i6);
        gjbVar2.setImportantForAccessibility(2);
        gjbVar2.setEllipsize(truncateAt);
        gjbVar2.setPadding(0, gm.L(1.0f), 0, gm.L(6.0f));
        boolean z5 = jb6.a0;
        if (z) {
            if (z5) {
                i8 = 5;
            } else {
                i8 = 3;
            }
            float f5 = i;
            addView(gjbVar2, qoe.d(-1, -2.0f, i8 | 80, f5, 32.0f, f5, 4.0f));
        } else {
            if (z5) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            float f6 = i;
            addView(gjbVar2, qoe.d(-1, -2.0f, i7, f6, 32.0f, f6, 4.0f));
        }
        updateColors();
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, qoe.i(48.0f, 48.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    public final void b(Drawable drawable, String str) {
        int L;
        boolean z;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
        if (!jb6.a0 && drawable != null) {
            L = gm.L(58.0f);
        } else {
            L = gm.L(23.0f);
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
            int L2 = gm.L(48.0f);
            int i2 = cmb.h6;
            ylb ylbVar = this.n;
            fg0 h0 = cmb.h0(L2, 0, cmb.v0(i2, ylbVar));
            wmb M = anb.M(i2);
            imageView.setBackground(h0);
            anb.j(imageView, h0, null, M, ylbVar);
            imageView.setImportantForAccessibility(1);
        }
        int L3 = gm.L(23.0f);
        if (drawable != null) {
            i = gm.L(48.0f);
        }
        int i3 = L3 + i;
        boolean z2 = jb6.a0;
        xna xnaVar = this.a;
        if (z2) {
            ((ViewGroup.MarginLayoutParams) xnaVar.getLayoutParams()).leftMargin = i3;
        } else {
            ((ViewGroup.MarginLayoutParams) xnaVar.getLayoutParams()).rightMargin = i3;
        }
        xnaVar.requestLayout();
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
        gjb gjbVar = this.c;
        gjbVar.setVisibility(0);
        gjbVar.setText(str2);
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
            ylb ylbVar = this.n;
            if (ylbVar != null) {
                paint = ylbVar.d("paintDivider");
            } else {
                paint = cmb.j0;
            }
            if (paint == null) {
                paint = cmb.j0;
            }
            Paint paint2 = paint;
            if (jb6.a0) {
                L = 0.0f;
            } else {
                L = gm.L(20.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (jb6.a0) {
                i = gm.L(20.0f);
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
            i2 = View.MeasureSpec.makeMeasureSpec(gm.L(60.0f) + (this.e ? 1 : 0), 1073741824);
        }
        super.onMeasure(makeMeasureSpec, i2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        gjb gjbVar = this.b;
        ClickableSpan b = gjbVar.b(((int) motionEvent.getX()) - gjbVar.getLeft(), ((int) motionEvent.getY()) - gjbVar.getTop());
        boolean z2 = false;
        if (b != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            xna xnaVar = this.a;
            if (xnaVar.a(((int) motionEvent.getX()) - xnaVar.getLeft(), ((int) motionEvent.getY()) - xnaVar.getTop()) != null) {
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
        int i = cmb.Wc;
        ylb ylbVar = this.n;
        int a = a(cmb.v0(i, ylbVar));
        xna xnaVar = this.a;
        xnaVar.setLinkTextColor(a);
        xnaVar.setTextColor(cmb.v0(cmb.F6, ylbVar));
        xnaVar.invalidate();
        int a2 = a(cmb.v0(i, ylbVar));
        gjb gjbVar = this.b;
        gjbVar.setLinkTextColor(a2);
        int i2 = cmb.y6;
        gjbVar.setTextColor(cmb.v0(i2, ylbVar));
        this.c.setTextColor(cmb.v0(i2, ylbVar));
        gjbVar.invalidate();
    }

    public int a(int i) {
        return i;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public hjb(ylb ylbVar, Context context, boolean z) {
        this(23, ylbVar, context, z, false);
    }
}
