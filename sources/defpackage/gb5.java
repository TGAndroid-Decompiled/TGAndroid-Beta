package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import org.telegram.messenger.a;
public final class gb5 extends vu7 {
    public final byte c;
    public final Object d;

    public gb5(Object obj, byte b) {
        this.c = b;
        this.d = obj;
    }

    @Override
    public final void a(fic ficVar, Object obj) {
        switch (this.c) {
            case 0:
                ficVar.removeView((View) obj);
                return;
            case 1:
                ficVar.removeView((View) obj);
                return;
            case 2:
                ficVar.removeView((View) obj);
                return;
            case 3:
                ficVar.removeView((View) obj);
                return;
            default:
                ficVar.removeView((View) obj);
                return;
        }
    }

    @Override
    public final int b() {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                return ((h85) obj).o1.length;
            case 1:
                return ((yr5) obj).G.length;
            case 2:
                return ((xk8) obj).n1.size();
            case 3:
                return ((zn8) obj).f.length;
            default:
                if (((pqb) obj).b != 0) {
                    return 1;
                }
                return 2;
        }
    }

    @Override
    public final int c(Object obj) {
        switch (this.c) {
            case 4:
                return -1;
            default:
                return super.c(obj);
        }
    }

    @Override
    public final Object e(fic ficVar, int i) {
        int i2;
        boolean z;
        float f;
        ImageView imageView;
        View view;
        byte b = this.c;
        int i3 = 2;
        int i4 = 0;
        Bitmap bitmap = null;
        Object obj = this.d;
        switch (b) {
            case 0:
                dh4 dh4Var = new dh4(this, ((h85) obj).getContext(), i, (byte) 1);
                dh4Var.setOnClickListener(new w0(this, i, (byte) 9));
                dh4Var.setFocusable(true);
                dh4Var.setTag(Integer.valueOf(i));
                dh4Var.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
                dh4Var.setScaleType(ImageView.ScaleType.FIT_XY);
                dh4Var.setLayoutParams(new ViewGroup.LayoutParams(hl.L(200.0f), -1));
                if (i == 0) {
                    dh4Var.setContentDescription(ob6.M0(2131742904, null));
                } else if (i == 1) {
                    dh4Var.setContentDescription(ob6.M0(2131742902, null));
                } else {
                    dh4Var.setContentDescription(ob6.M0(2131742903, null));
                }
                if (i == 0) {
                    i2 = 2131624175;
                } else if (i == 1) {
                    i2 = 2131624177;
                } else {
                    i2 = 2131624176;
                }
                ggb h = hgb.h(hl.v2(null, i2));
                h.s = false;
                dh4Var.setImageDrawable(h);
                if (dh4Var.getParent() != null) {
                    ((ViewGroup) dh4Var.getParent()).removeView(dh4Var);
                }
                ficVar.addView(dh4Var, 0);
                return dh4Var;
            case 1:
                TextView textView = new TextView(ficVar.getContext());
                yr5 yr5Var = (yr5) obj;
                textView.setTag(yr5Var.a);
                TextView textView2 = new TextView(ficVar.getContext());
                textView2.setTag(yr5Var.b);
                tt ttVar = new tt(ficVar.getContext(), textView, textView2);
                int i5 = aob.G6;
                qd4.w(textView, i5, null, 1, 26.0f);
                textView.setGravity(17);
                ttVar.addView(textView, tre.d(-1, -2.0f, 51, 18.0f, 244.0f, 18.0f, 0.0f));
                yob.X(textView2, i5, null);
                textView2.setTextSize(1, 15.0f);
                textView2.setLineSpacing(hl.N(2.33f), 1.0f);
                textView2.setGravity(17);
                ttVar.addView(textView2, tre.d(-1, -2.0f, 51, 16.0f, 286.0f, 16.0f, 0.0f));
                ficVar.addView(ttVar, 0);
                textView.setText(yr5Var.G[i]);
                textView2.setText(hl.S2(yr5Var.H[i]));
                return ttVar;
            case 2:
                xk8 xk8Var = (xk8) obj;
                wk8 wk8Var = new wk8(xk8Var, xk8Var.getContext(), i);
                ficVar.addView(wk8Var);
                wk8Var.a = i;
                sl8 sl8Var = (sl8) xk8Var.n1.get(i);
                byte b2 = sl8Var.a;
                String str = sl8Var.d;
                String str2 = sl8Var.c;
                TextView textView3 = wk8Var.b;
                p66 p66Var = wk8Var.c;
                if (b2 != 0 && b2 != 14 && b2 != 28) {
                    if (xk8Var.y1) {
                        byte b3 = xk8Var.x1;
                        if (b3 == 4) {
                            textView3.setText(ob6.M0(2131754346, null));
                            p66Var.setText(hl.S2(ob6.M0(2131754345, null)));
                        } else if (b3 == 3) {
                            textView3.setText(ob6.M0(2131746721, null));
                            p66Var.setText(hl.S2(ob6.M0(2131746719, null)));
                        } else if (b3 == 24) {
                            textView3.setText(ob6.M0(2131746701, null));
                            p66Var.setText(hl.S2(ob6.M0(2131746699, null)));
                        } else if (b3 == 10) {
                            textView3.setText(ob6.M0(2131746749, null));
                            p66Var.setText(hl.S2(ob6.M0(2131746747, null)));
                        } else if (b3 == 2) {
                            textView3.setText(ob6.M0(2131746741, null));
                            p66Var.setText(hl.S2(ob6.M0(2131746739, null)));
                        } else if (b3 == 9) {
                            textView3.setText(ob6.M0(2131746754, null));
                            p66Var.setText(hl.S2(ob6.M0(2131746752, null)));
                        } else if (b3 == 8) {
                            textView3.setText(ob6.M0(2131746691, null));
                            p66Var.setText(hl.S2(ob6.M0(2131746689, null)));
                        } else if (b3 == 13) {
                            textView3.setText(ob6.M0(2131746695, null));
                            p66Var.setText(hl.S2(ob6.M0(2131746694, null)));
                        } else if (b3 == 38) {
                            textView3.setText(ob6.M0(2131746738, null));
                            p66Var.setText(hl.S2(ob6.M0(2131746737, null)));
                        } else if (b3 == 22) {
                            textView3.setText(ob6.M0(2131746688, null));
                            p66Var.setText(hl.S2(ob6.M0(2131746687, null)));
                        } else if (b3 == 23) {
                            textView3.setText(ob6.M0(2131746714, null));
                            p66Var.setText(hl.S2(ob6.M0(2131746713, null)));
                        } else if (b3 == 41) {
                            textView3.setText(ob6.M0(2131746707, null));
                            p66Var.setText(hl.S2(ob6.M0(2131746706, null)));
                        } else {
                            textView3.setText(str2);
                            p66Var.setText(hl.S2(str));
                        }
                        wk8Var.h = false;
                    } else {
                        textView3.setText(str2);
                        p66Var.setText(hl.S2(str));
                        wk8Var.h = false;
                    }
                } else {
                    textView3.setText("");
                    p66Var.setText("");
                    wk8Var.h = true;
                }
                p66Var.setMaxWidth(kg5.a(p66Var.getText(), p66Var.getPaint()));
                wk8Var.requestLayout();
                if (sl8Var.a == 40) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && wk8Var.d == null) {
                    LinearLayout linearLayout = new LinearLayout(wk8Var.getContext());
                    wk8Var.d = linearLayout;
                    linearLayout.setOrientation(1);
                    Context context = wk8Var.getContext();
                    int i6 = xk8.I1;
                    bc bcVar = new bc(xk8Var.J0, context, true);
                    bcVar.a(2131231825, ob6.M0(2131749345, null), ob6.M0(2131749346, null));
                    wk8Var.d.addView(r2[0], tre.o(-1, -2));
                    bc bcVar2 = new bc(xk8Var.J0, wk8Var.getContext(), true);
                    bcVar2.a(2131231821, ob6.M0(2131749343, null), ob6.M0(2131749344, null));
                    wk8Var.d.addView(r2[1], tre.o(-1, -2));
                    bc bcVar3 = new bc(xk8Var.J0, wk8Var.getContext(), true);
                    bc[] bcVarArr = {bcVar, bcVar2, bcVar3};
                    bcVar3.a(2131231928, ob6.M0(2131749341, null), ob6.M0(2131749342, null));
                    wk8Var.d.addView(bcVarArr[2], tre.o(-1, -2));
                    wk8Var.addView(wk8Var.d, tre.k(0.0f, -4.0f, 0.0f, 0.0f, -1, -2));
                }
                LinearLayout linearLayout2 = wk8Var.d;
                if (linearLayout2 != null) {
                    if (!z) {
                        i4 = 8;
                    }
                    linearLayout2.setVisibility(i4);
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) p66Var.getLayoutParams();
                if (z) {
                    f = 6.0f;
                } else {
                    f = 10.0f;
                }
                marginLayoutParams.topMargin = hl.L(f);
                return wk8Var;
            case 3:
                zn8 zn8Var = (zn8) obj;
                boolean z2 = zn8Var.E;
                if (z2 && i == 0) {
                    ?? frameLayout = new FrameLayout(zn8Var.getContext());
                    frameLayout.setBackground(new ih7(-14602694, -13935795, -14395293, -14203560, true, false));
                    ImageView imageView2 = new ImageView(zn8Var.getContext());
                    imageView2.setScaleType(ImageView.ScaleType.CENTER);
                    imageView2.setImageResource(2131232695);
                    frameLayout.addView(imageView2, tre.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
                    TextView textView4 = new TextView(zn8Var.getContext());
                    textView4.setText(ob6.M0(2131742875, null));
                    textView4.setGravity(17);
                    textView4.setLineSpacing(hl.L(2.0f), 1.0f);
                    textView4.setTextColor(-1);
                    textView4.setTextSize(1, 15.0f);
                    textView4.setTypeface(hl.o());
                    frameLayout.addView(textView4, tre.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
                    imageView = frameLayout;
                } else {
                    ImageView imageView3 = new ImageView(zn8Var.getContext());
                    imageView3.setTag(Integer.valueOf(i));
                    try {
                        File h2 = a.h();
                        StringBuilder sb = new StringBuilder("cthumb");
                        if (i == 0 || (i == 1 && z2)) {
                            i3 = 1;
                        }
                        sb.append(i3);
                        sb.append(".jpg");
                        bitmap = BitmapFactory.decodeFile(new File(h2, sb.toString()).getAbsolutePath());
                    } catch (Throwable unused) {
                    }
                    if (bitmap != null) {
                        imageView3.setImageBitmap(bitmap);
                    } else {
                        imageView3.setImageResource(2131231495);
                    }
                    imageView3.setScaleType(ImageView.ScaleType.FIT_XY);
                    imageView = imageView3;
                }
                if (imageView.getParent() != null) {
                    ((ViewGroup) imageView.getParent()).removeView(imageView);
                }
                ficVar.addView(imageView, 0);
                return imageView;
            default:
                pqb pqbVar = (pqb) obj;
                if (i == 0) {
                    view = pqbVar.v0;
                } else {
                    view = pqbVar.o0;
                }
                ficVar.addView(view);
                return view;
        }
    }

    @Override
    public final boolean f(View view, Object obj) {
        switch (this.c) {
            case 0:
                return view.equals(obj);
            case 1:
                return view.equals(obj);
            case 2:
                if (view != obj) {
                    return false;
                }
                return true;
            case 3:
                return view.equals(obj);
            default:
                if (obj != view) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final void h(int i) {
        switch (this.c) {
            case 0:
                return;
            case 1:
                yr5 yr5Var = (yr5) this.d;
                yr5Var.e.setCurrentPage(i);
                yr5Var.I = i;
                return;
            case 2:
            case 3:
            default:
                return;
        }
    }

    private final void j(int i) {
    }

    private final void k(int i) {
    }
}
