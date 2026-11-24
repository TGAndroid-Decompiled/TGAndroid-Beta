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
public final class f95 extends pr7 {
    public final byte c;
    public final Object d;

    public f95(Object obj, byte b) {
        this.c = b;
        this.d = obj;
    }

    @Override
    public final void a(gec gecVar, Object obj) {
        switch (this.c) {
            case 0:
                gecVar.removeView((View) obj);
                return;
            case 1:
                gecVar.removeView((View) obj);
                return;
            case 2:
                gecVar.removeView((View) obj);
                return;
            case 3:
                gecVar.removeView((View) obj);
                return;
            default:
                gecVar.removeView((View) obj);
                return;
        }
    }

    @Override
    public final int b() {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                return ((f65) obj).o1.length;
            case 1:
                return ((wp5) obj).G.length;
            case 2:
                return ((jh8) obj).n1.size();
            case 3:
                return ((mk8) obj).f.length;
            default:
                if (((qmb) obj).b != 0) {
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
    public final Object e(gec gecVar, int i) {
        int i2;
        boolean z;
        float f;
        ImageView imageView;
        View view;
        byte b = this.c;
        int i3 = 8;
        int i4 = 2;
        Bitmap bitmap = null;
        Object obj = this.d;
        switch (b) {
            case 0:
                ef4 ef4Var = new ef4(this, ((f65) obj).getContext(), i, (byte) 1);
                ef4Var.setOnClickListener(new v0(this, i, (byte) 8));
                ef4Var.setFocusable(true);
                ef4Var.setTag(Integer.valueOf(i));
                ef4Var.setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
                ef4Var.setScaleType(ImageView.ScaleType.FIT_XY);
                ef4Var.setLayoutParams(new ViewGroup.LayoutParams(gl.L(200.0f), -1));
                if (i == 0) {
                    ef4Var.setContentDescription(k96.M0(2131743010, null));
                } else if (i == 1) {
                    ef4Var.setContentDescription(k96.M0(2131743008, null));
                } else {
                    ef4Var.setContentDescription(k96.M0(2131743009, null));
                }
                if (i == 0) {
                    i2 = 2131624176;
                } else if (i == 1) {
                    i2 = 2131624178;
                } else {
                    i2 = 2131624177;
                }
                kcb h = lcb.h(gl.v2(null, i2));
                h.s = false;
                ef4Var.setImageDrawable(h);
                if (ef4Var.getParent() != null) {
                    ((ViewGroup) ef4Var.getParent()).removeView(ef4Var);
                }
                gecVar.addView(ef4Var, 0);
                return ef4Var;
            case 1:
                TextView textView = new TextView(gecVar.getContext());
                wp5 wp5Var = (wp5) obj;
                textView.setTag(wp5Var.a);
                TextView textView2 = new TextView(gecVar.getContext());
                textView2.setTag(wp5Var.b);
                st stVar = new st(gecVar.getContext(), textView, textView2);
                int i5 = bkb.F6;
                tb4.w(textView, i5, null, 1, 26.0f);
                textView.setGravity(17);
                stVar.addView(textView, nme.d(-1, -2.0f, 51, 18.0f, 244.0f, 18.0f, 0.0f));
                zkb.X(textView2, i5, null);
                textView2.setTextSize(1, 15.0f);
                textView2.setLineSpacing(gl.N(2.33f), 1.0f);
                textView2.setGravity(17);
                stVar.addView(textView2, nme.d(-1, -2.0f, 51, 16.0f, 286.0f, 16.0f, 0.0f));
                gecVar.addView(stVar, 0);
                textView.setText(wp5Var.G[i]);
                textView2.setText(gl.T2(wp5Var.H[i]));
                return stVar;
            case 2:
                jh8 jh8Var = (jh8) obj;
                ih8 ih8Var = new ih8(jh8Var, jh8Var.getContext(), i);
                gecVar.addView(ih8Var);
                ih8Var.a = i;
                fi8 fi8Var = (fi8) jh8Var.n1.get(i);
                byte b2 = fi8Var.a;
                String str = fi8Var.d;
                String str2 = fi8Var.c;
                TextView textView3 = ih8Var.b;
                l46 l46Var = ih8Var.c;
                if (b2 != 0 && b2 != 14 && b2 != 28) {
                    if (jh8Var.y1) {
                        byte b3 = jh8Var.x1;
                        if (b3 == 4) {
                            textView3.setText(k96.M0(2131754350, null));
                            l46Var.setText(gl.T2(k96.M0(2131754349, null)));
                        } else if (b3 == 3) {
                            textView3.setText(k96.M0(2131746801, null));
                            l46Var.setText(gl.T2(k96.M0(2131746799, null)));
                        } else if (b3 == 24) {
                            textView3.setText(k96.M0(2131746781, null));
                            l46Var.setText(gl.T2(k96.M0(2131746779, null)));
                        } else if (b3 == 10) {
                            textView3.setText(k96.M0(2131746829, null));
                            l46Var.setText(gl.T2(k96.M0(2131746827, null)));
                        } else if (b3 == 2) {
                            textView3.setText(k96.M0(2131746821, null));
                            l46Var.setText(gl.T2(k96.M0(2131746819, null)));
                        } else if (b3 == 9) {
                            textView3.setText(k96.M0(2131746834, null));
                            l46Var.setText(gl.T2(k96.M0(2131746832, null)));
                        } else if (b3 == 8) {
                            textView3.setText(k96.M0(2131746771, null));
                            l46Var.setText(gl.T2(k96.M0(2131746769, null)));
                        } else if (b3 == 13) {
                            textView3.setText(k96.M0(2131746775, null));
                            l46Var.setText(gl.T2(k96.M0(2131746774, null)));
                        } else if (b3 == 38) {
                            textView3.setText(k96.M0(2131746818, null));
                            l46Var.setText(gl.T2(k96.M0(2131746817, null)));
                        } else if (b3 == 22) {
                            textView3.setText(k96.M0(2131746768, null));
                            l46Var.setText(gl.T2(k96.M0(2131746767, null)));
                        } else if (b3 == 23) {
                            textView3.setText(k96.M0(2131746794, null));
                            l46Var.setText(gl.T2(k96.M0(2131746793, null)));
                        } else if (b3 == 41) {
                            textView3.setText(k96.M0(2131746787, null));
                            l46Var.setText(gl.T2(k96.M0(2131746786, null)));
                        } else {
                            textView3.setText(str2);
                            l46Var.setText(gl.T2(str));
                        }
                        ih8Var.h = false;
                    } else {
                        textView3.setText(str2);
                        l46Var.setText(gl.T2(str));
                        ih8Var.h = false;
                    }
                } else {
                    textView3.setText("");
                    l46Var.setText("");
                    ih8Var.h = true;
                }
                l46Var.setMaxWidth(je5.a(l46Var.getText(), l46Var.getPaint()));
                ih8Var.requestLayout();
                if (fi8Var.a == 40) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && ih8Var.d == null) {
                    LinearLayout linearLayout = new LinearLayout(ih8Var.getContext());
                    ih8Var.d = linearLayout;
                    linearLayout.setOrientation(1);
                    Context context = ih8Var.getContext();
                    int i6 = jh8.I1;
                    ac acVar = new ac(jh8Var.J0, context, true);
                    acVar.a(2131231825, k96.M0(2131749399, null), k96.M0(2131749400, null));
                    ih8Var.d.addView(r2[0], nme.o(-1, -2));
                    ac acVar2 = new ac(jh8Var.J0, ih8Var.getContext(), true);
                    acVar2.a(2131231821, k96.M0(2131749397, null), k96.M0(2131749398, null));
                    ih8Var.d.addView(r2[1], nme.o(-1, -2));
                    ac acVar3 = new ac(jh8Var.J0, ih8Var.getContext(), true);
                    ac[] acVarArr = {acVar, acVar2, acVar3};
                    acVar3.a(2131231928, k96.M0(2131749395, null), k96.M0(2131749396, null));
                    ih8Var.d.addView(acVarArr[2], nme.o(-1, -2));
                    ih8Var.addView(ih8Var.d, nme.k(0.0f, -4.0f, 0.0f, 0.0f, -1, -2));
                }
                LinearLayout linearLayout2 = ih8Var.d;
                if (linearLayout2 != null) {
                    if (z) {
                        i3 = 0;
                    }
                    linearLayout2.setVisibility(i3);
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) l46Var.getLayoutParams();
                if (z) {
                    f = 6.0f;
                } else {
                    f = 10.0f;
                }
                marginLayoutParams.topMargin = gl.L(f);
                return ih8Var;
            case 3:
                mk8 mk8Var = (mk8) obj;
                boolean z2 = mk8Var.E;
                if (z2 && i == 0) {
                    ?? frameLayout = new FrameLayout(mk8Var.getContext());
                    frameLayout.setBackground(new ye7(-14602694, -13935795, -14395293, -14203560, true, false));
                    ImageView imageView2 = new ImageView(mk8Var.getContext());
                    imageView2.setScaleType(ImageView.ScaleType.CENTER);
                    imageView2.setImageResource(2131232684);
                    frameLayout.addView(imageView2, nme.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
                    TextView textView4 = new TextView(mk8Var.getContext());
                    textView4.setText(k96.M0(2131742981, null));
                    textView4.setGravity(17);
                    textView4.setLineSpacing(gl.L(2.0f), 1.0f);
                    textView4.setTextColor(-1);
                    textView4.setTextSize(1, 15.0f);
                    textView4.setTypeface(gl.o());
                    frameLayout.addView(textView4, nme.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
                    imageView = frameLayout;
                } else {
                    ImageView imageView3 = new ImageView(mk8Var.getContext());
                    imageView3.setTag(Integer.valueOf(i));
                    try {
                        File h2 = a.h();
                        StringBuilder sb = new StringBuilder("cthumb");
                        if (i == 0 || (i == 1 && z2)) {
                            i4 = 1;
                        }
                        sb.append(i4);
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
                gecVar.addView(imageView, 0);
                return imageView;
            default:
                qmb qmbVar = (qmb) obj;
                if (i == 0) {
                    view = qmbVar.v0;
                } else {
                    view = qmbVar.o0;
                }
                gecVar.addView(view);
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
                wp5 wp5Var = (wp5) this.d;
                wp5Var.e.setCurrentPage(i);
                wp5Var.I = i;
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
