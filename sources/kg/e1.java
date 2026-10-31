package kg;

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
import org.telegram.messenger.c00;
import org.telegram.messenger.cd;
import org.telegram.messenger.d00;
import org.telegram.messenger.m5;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.q20;
import org.telegram.ui.b40;
import org.telegram.ui.eu0;
import org.telegram.ui.m91;
import org.telegram.ui.s60;
import vh.p2;
import w7.b6;
public final class e1 extends z4.a {
    public final int f11043c;
    public final Object d;

    public e1(Object obj, int i10) {
        this.f11043c = i10;
        this.d = obj;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        switch (this.f11043c) {
            case 0:
                gVar.removeView((View) obj);
                return;
            case 1:
                gVar.removeView((View) obj);
                return;
            case 2:
                gVar.removeView((View) obj);
                return;
            case 3:
                gVar.removeView((View) obj);
                return;
            default:
                gVar.removeView((View) obj);
                return;
        }
    }

    @Override
    public final int b() {
        switch (this.f11043c) {
            case 0:
                return ((i1) this.d).f11112k1.size();
            case 1:
                return ((b40) this.d).l1.length;
            case 2:
                return ((org.telegram.ui.Components.voip.e0) this.d).f31398f.length;
            case 3:
                return ((s60) this.d).F.length;
            default:
                if (((m91) this.d).f39540b != 0) {
                    return 1;
                }
                return 2;
        }
    }

    @Override
    public int c(Object obj) {
        switch (this.f11043c) {
            case 4:
                return -1;
            default:
                return super.c(obj);
        }
    }

    @Override
    public final Object e(z4.g gVar, int i10) {
        boolean z10;
        float f7;
        int i11;
        ImageView imageView;
        View view;
        int i12 = this.f11043c;
        int i13 = 8;
        int i14 = 2;
        Bitmap bitmap = null;
        Object obj = this.d;
        switch (i12) {
            case 0:
                i1 i1Var = (i1) obj;
                h1 h1Var = new h1(i1Var, i1Var.getContext(), i10);
                gVar.addView(h1Var);
                h1Var.f11100a = i10;
                eu0 eu0Var = (eu0) i1Var.f11112k1.get(i10);
                int i15 = eu0Var.f37112a;
                String str = eu0Var.d;
                CharSequence charSequence = eu0Var.f37114c;
                TextView textView = h1Var.f11101b;
                p80 p80Var = h1Var.f11102c;
                if (i15 != 0 && i15 != 14 && i15 != 28) {
                    if (i1Var.f11122v1) {
                        int i16 = i1Var.f11121u1;
                        if (i16 == 4) {
                            textView.setText(cd.L0(2131754353, null));
                            p80Var.setText(org.telegram.messenger.i0.W2(cd.L0(2131754352, null)));
                        } else if (i16 == 3) {
                            textView.setText(cd.L0(2131747007, null));
                            p80Var.setText(org.telegram.messenger.i0.W2(cd.L0(2131747005, null)));
                        } else if (i16 == 24) {
                            textView.setText(cd.L0(2131746987, null));
                            p80Var.setText(org.telegram.messenger.i0.W2(cd.L0(2131746985, null)));
                        } else if (i16 == 10) {
                            textView.setText(cd.L0(2131747035, null));
                            p80Var.setText(org.telegram.messenger.i0.W2(cd.L0(2131747033, null)));
                        } else if (i16 == 2) {
                            textView.setText(cd.L0(2131747027, null));
                            p80Var.setText(org.telegram.messenger.i0.W2(cd.L0(2131747025, null)));
                        } else if (i16 == 9) {
                            textView.setText(cd.L0(2131747040, null));
                            p80Var.setText(org.telegram.messenger.i0.W2(cd.L0(2131747038, null)));
                        } else if (i16 == 8) {
                            textView.setText(cd.L0(2131746977, null));
                            p80Var.setText(org.telegram.messenger.i0.W2(cd.L0(2131746975, null)));
                        } else if (i16 == 13) {
                            textView.setText(cd.L0(2131746981, null));
                            p80Var.setText(org.telegram.messenger.i0.W2(cd.L0(2131746980, null)));
                        } else if (i16 == 38) {
                            textView.setText(cd.L0(2131747024, null));
                            p80Var.setText(org.telegram.messenger.i0.W2(cd.L0(2131747023, null)));
                        } else if (i16 == 22) {
                            textView.setText(cd.L0(2131746974, null));
                            p80Var.setText(org.telegram.messenger.i0.W2(cd.L0(2131746973, null)));
                        } else if (i16 == 23) {
                            textView.setText(cd.L0(2131747000, null));
                            p80Var.setText(org.telegram.messenger.i0.W2(cd.L0(2131746999, null)));
                        } else if (i16 == 41) {
                            textView.setText(cd.L0(2131746993, null));
                            p80Var.setText(org.telegram.messenger.i0.W2(cd.L0(2131746992, null)));
                        } else {
                            textView.setText(charSequence);
                            p80Var.setText(org.telegram.messenger.i0.W2(str));
                        }
                        h1Var.h = false;
                    } else {
                        textView.setText(charSequence);
                        p80Var.setText(org.telegram.messenger.i0.W2(str));
                        h1Var.h = false;
                    }
                } else {
                    textView.setText("");
                    p80Var.setText("");
                    h1Var.h = true;
                }
                p80Var.setMaxWidth(p2.a(p80Var.getText(), p80Var.getPaint()));
                h1Var.requestLayout();
                if (eu0Var.f37112a == 40) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && h1Var.d == null) {
                    LinearLayout linearLayout = new LinearLayout(h1Var.getContext());
                    h1Var.d = linearLayout;
                    linearLayout.setOrientation(1);
                    Context context = h1Var.getContext();
                    int i17 = i1.F1;
                    xh.h hVar = new xh.h(context, i1Var.I0, true);
                    hVar.a(2131231820, cd.L0(2131749583, null), cd.L0(2131749584, null));
                    h1Var.d.addView(r2[0], b6.o(-1, -2));
                    xh.h hVar2 = new xh.h(h1Var.getContext(), i1Var.I0, true);
                    hVar2.a(2131231816, cd.L0(2131749581, null), cd.L0(2131749582, null));
                    h1Var.d.addView(r2[1], b6.o(-1, -2));
                    xh.h hVar3 = new xh.h(h1Var.getContext(), i1Var.I0, true);
                    xh.h[] hVarArr = {hVar, hVar2, hVar3};
                    hVar3.a(2131231923, cd.L0(2131749579, null), cd.L0(2131749580, null));
                    h1Var.d.addView(hVarArr[2], b6.o(-1, -2));
                    h1Var.addView(h1Var.d, b6.k(0.0f, -4.0f, 0.0f, 0.0f, -1, -2));
                }
                LinearLayout linearLayout2 = h1Var.d;
                if (linearLayout2 != null) {
                    if (z10) {
                        i13 = 0;
                    }
                    linearLayout2.setVisibility(i13);
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) p80Var.getLayoutParams();
                if (z10) {
                    f7 = 6.0f;
                } else {
                    f7 = 10.0f;
                }
                marginLayoutParams.topMargin = org.telegram.messenger.i0.L(f7);
                return h1Var;
            case 1:
                q20 q20Var = new q20(this, ((b40) obj).getContext(), i10, 0);
                q20Var.setOnClickListener(new bh.f(this, i10, 8));
                q20Var.setFocusable(true);
                q20Var.setTag(Integer.valueOf(i10));
                q20Var.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
                q20Var.setScaleType(ImageView.ScaleType.FIT_XY);
                q20Var.setLayoutParams(new ViewGroup.LayoutParams(org.telegram.messenger.i0.L(200.0f), -1));
                if (i10 == 0) {
                    q20Var.setContentDescription(cd.L0(2131743278, null));
                } else if (i10 == 1) {
                    q20Var.setContentDescription(cd.L0(2131743276, null));
                } else {
                    q20Var.setContentDescription(cd.L0(2131743277, null));
                }
                if (i10 == 0) {
                    i11 = 2131624173;
                } else if (i10 == 1) {
                    i11 = 2131624175;
                } else {
                    i11 = 2131624174;
                }
                c00 i18 = d00.i(org.telegram.messenger.i0.y2(null, i11));
                i18.f14887s = false;
                q20Var.setImageDrawable(i18);
                if (q20Var.getParent() != null) {
                    ((ViewGroup) q20Var.getParent()).removeView(q20Var);
                }
                gVar.addView(q20Var, 0);
                return q20Var;
            case 2:
                org.telegram.ui.Components.voip.e0 e0Var = (org.telegram.ui.Components.voip.e0) obj;
                boolean z11 = e0Var.D;
                if (z11 && i10 == 0) {
                    ?? frameLayout = new FrameLayout(e0Var.getContext());
                    frameLayout.setBackground(new jb0(true, -14602694, -13935795, -14395293, -14203560));
                    ImageView imageView2 = new ImageView(e0Var.getContext());
                    imageView2.setScaleType(ImageView.ScaleType.CENTER);
                    imageView2.setImageResource(2131232676);
                    frameLayout.addView(imageView2, b6.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
                    TextView textView2 = new TextView(e0Var.getContext());
                    textView2.setText(cd.L0(2131743249, null));
                    textView2.setGravity(17);
                    textView2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                    textView2.setTextColor(-1);
                    textView2.setTextSize(1, 15.0f);
                    textView2.setTypeface(org.telegram.messenger.i0.o());
                    frameLayout.addView(textView2, b6.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
                    imageView = frameLayout;
                } else {
                    ImageView imageView3 = new ImageView(e0Var.getContext());
                    imageView3.setTag(Integer.valueOf(i10));
                    try {
                        File h = org.telegram.messenger.w0.h();
                        StringBuilder sb2 = new StringBuilder("cthumb");
                        if (i10 == 0 || (i10 == 1 && z11)) {
                            i14 = 1;
                        }
                        sb2.append(i14);
                        sb2.append(".jpg");
                        bitmap = BitmapFactory.decodeFile(new File(h, sb2.toString()).getAbsolutePath());
                    } catch (Throwable unused) {
                    }
                    if (bitmap != null) {
                        imageView3.setImageBitmap(bitmap);
                    } else {
                        imageView3.setImageResource(2131231493);
                    }
                    imageView3.setScaleType(ImageView.ScaleType.FIT_XY);
                    imageView = imageView3;
                }
                if (imageView.getParent() != null) {
                    ((ViewGroup) imageView.getParent()).removeView(imageView);
                }
                gVar.addView(imageView, 0);
                return imageView;
            case 3:
                TextView textView3 = new TextView(gVar.getContext());
                s60 s60Var = (s60) obj;
                textView3.setTag(s60Var.f41383a);
                TextView textView4 = new TextView(gVar.getContext());
                textView4.setTag(s60Var.f41384b);
                fg.i iVar = new fg.i(gVar.getContext(), textView3, textView4);
                int i19 = t6.G6;
                m5.m(textView3, i19, null, 1, 26.0f);
                textView3.setGravity(17);
                iVar.addView(textView3, b6.d(-1, -2.0f, 51, 18.0f, 244.0f, 18.0f, 0.0f));
                a7.V(textView4, i19, null);
                textView4.setTextSize(1, 15.0f);
                textView4.setLineSpacing(org.telegram.messenger.i0.N(2.33f), 1.0f);
                textView4.setGravity(17);
                iVar.addView(textView4, b6.d(-1, -2.0f, 51, 16.0f, 286.0f, 16.0f, 0.0f));
                gVar.addView(iVar, 0);
                textView3.setText(s60Var.F[i10]);
                textView4.setText(org.telegram.messenger.i0.W2(s60Var.G[i10]));
                return iVar;
            default:
                m91 m91Var = (m91) obj;
                if (i10 == 0) {
                    view = m91Var.f39592u0;
                } else {
                    view = m91Var.f39576n0;
                }
                gVar.addView(view);
                return view;
        }
    }

    @Override
    public final boolean f(View view, Object obj) {
        switch (this.f11043c) {
            case 0:
                if (view == obj) {
                    return true;
                }
                return false;
            case 1:
                return view.equals(obj);
            case 2:
                return view.equals(obj);
            case 3:
                return view.equals(obj);
            default:
                if (obj == view) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public void h(int i10) {
        switch (this.f11043c) {
            case 1:
            case 2:
                return;
            case 3:
                s60 s60Var = (s60) this.d;
                s60Var.e.setCurrentPage(i10);
                s60Var.H = i10;
                return;
            default:
                return;
        }
    }

    private final void j(int i10) {
    }

    private final void k(int i10) {
    }
}
