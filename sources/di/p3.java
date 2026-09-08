package di;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.wl;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.tk0;
public final class p3 extends tk0 {
    public final x3 f7851c;

    public p3(x3 x3Var) {
        this.f7851c = x3Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f45770f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        MediaController.PhotoEntry photoEntry;
        int i11 = i10 - 2;
        x3 x3Var = this.f7851c;
        if (x3Var.f8395c0) {
            if (i11 == 0) {
                return null;
            }
            i11 = i10 - 3;
        } else if (x3Var.f8396d0) {
            if (i11 >= 0 && i11 < x3Var.f8393b0.size()) {
                return LocaleController.formatYearMont(((o8) x3Var.f8393b0.get(i11)).d / 1000, true);
            }
            i11 -= x3Var.f8393b0.size();
        }
        ArrayList arrayList = x3Var.f8400f0;
        if (arrayList == null || i11 < 0 || i11 >= arrayList.size() || (photoEntry = (MediaController.PhotoEntry) x3Var.f8400f0.get(i11)) == null) {
            return null;
        }
        long j3 = photoEntry.dateTaken;
        if (Build.VERSION.SDK_INT <= 28) {
            j3 /= 1000;
        }
        return LocaleController.formatYearMont(j3, true);
    }

    @Override
    public final void G(ll0 ll0Var, float f7, int[] iArr) {
        int i10;
        int k10 = k();
        x3 x3Var = this.f7851c;
        g3 g3Var = x3Var.f8397e;
        float f10 = g3Var.J;
        int width = (int) (((int) (((ll0Var.getWidth() - ll0Var.getPaddingLeft()) - ll0Var.getPaddingRight()) / f10)) * x3Var.O);
        int ceil = (int) Math.ceil(k10 / f10);
        float lerp = (AndroidUtilities.lerp(0, Math.max(0, i10 - ((AndroidUtilities.displaySize.y - ll0Var.getPaddingTop()) - ll0Var.getPaddingBottom())), f7) / (ceil * width)) * ceil;
        int round = Math.round(lerp);
        iArr[0] = Math.max(0, g3Var.J * round) + 2;
        iArr[1] = ll0Var.getPaddingTop() + ((int) ((lerp - round) * width));
    }

    @Override
    public final float H(ll0 ll0Var) {
        x3 x3Var;
        int k10 = k();
        float f7 = this.f7851c.f8397e.J;
        return (Math.max(0, ll0Var.computeVerticalScrollOffset() - x3Var.getPadding()) - ll0Var.getPaddingTop()) / ((((int) Math.ceil(k10 / f7)) * ((int) (((int) (((ll0Var.getWidth() - ll0Var.getPaddingLeft()) - ll0Var.getPaddingRight()) / f7)) * x3Var.O))) - (AndroidUtilities.displaySize.y - ll0Var.getPaddingTop()));
    }

    @Override
    public final int h() {
        return k() + 3;
    }

    @Override
    public final int j(int i10) {
        if (i10 != 0 && i10 != h() - 1) {
            if (i10 == 1) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final int k() {
        int size;
        x3 x3Var = this.f7851c;
        ArrayList arrayList = x3Var.f8400f0;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        if (x3Var.f8395c0) {
            return size + 1;
        }
        if (x3Var.f8396d0) {
            return x3Var.f8393b0.size() + size;
        }
        return size;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        x3 x3Var = this.f7851c;
        ArrayList arrayList = x3Var.f8402h0;
        ArrayList arrayList2 = x3Var.f8393b0;
        int i11 = c1Var.f45770f;
        View view = c1Var.f45766a;
        int i12 = -1;
        if (i11 == 0) {
            t3 t3Var = (t3) view;
            if (i10 == 0) {
                i12 = x3Var.getPadding();
            }
            t3Var.f8205a = i12;
        } else if (i11 == 2) {
            s3 s3Var = (s3) view;
            boolean z13 = true;
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i10 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            s3Var.U = z10;
            s3Var.V = z11;
            s3Var.M = new o3(this, s3Var, 0);
            s3Var.N = new o3(this, s3Var, 1);
            int i13 = i10 - 2;
            if (x3Var.f8395c0) {
                if (i13 == 0) {
                    s3Var.f(-1, false, false);
                    s3Var.e(arrayList2.size(), (o8) arrayList2.get(0));
                    return;
                }
                i13 = i10 - 3;
            } else if (x3Var.f8396d0) {
                if (i13 >= 0 && i13 < arrayList2.size()) {
                    s3Var.f(-1, false, false);
                    s3Var.e(0, (o8) arrayList2.get(i13));
                    return;
                }
                i13 -= arrayList2.size();
            }
            ArrayList arrayList3 = x3Var.f8400f0;
            if (arrayList3 != null && i13 >= 0 && i13 < arrayList3.size()) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) x3Var.f8400f0.get(i13);
                if (arrayList.isEmpty() && !x3Var.Q) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                int indexOf = arrayList.indexOf(photoEntry);
                if (s3Var.S != photoEntry) {
                    z13 = false;
                }
                s3Var.f(indexOf, z12, z13);
                s3Var.S = photoEntry;
                if (photoEntry != null && photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                    str = AndroidUtilities.formatShortDuration(photoEntry.duration);
                } else {
                    str = null;
                }
                s3Var.g(str);
                s3Var.F = null;
                if (photoEntry == null) {
                    s3Var.O = null;
                } else if (photoEntry.isVideo) {
                    StringBuilder sb2 = new StringBuilder();
                    wl.l(R.string.AttachVideo, ", ", sb2);
                    sb2.append(LocaleController.formatDuration(photoEntry.duration));
                    s3Var.O = sb2.toString();
                } else {
                    s3Var.O = LocaleController.getString(R.string.AttachPhoto);
                }
                s3Var.b(photoEntry);
                s3Var.invalidate();
                if (x3Var.M) {
                    s3Var.I.setOnClickListener(new bi.x(this, photoEntry, s3Var, 5));
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        float f7;
        float f10;
        bi.g5 g5Var;
        x3 x3Var = this.f7851c;
        if (i10 == 0) {
            g5Var = new t3(x3Var, x3Var.getContext());
        } else if (i10 == 1) {
            Context context = x3Var.getContext();
            boolean z10 = x3Var.L;
            bi.g5 g5Var2 = new bi.g5(context, 1);
            if (z10) {
                f7 = 14.0f;
            } else {
                f7 = 16.0f;
            }
            g5Var2.setPadding(AndroidUtilities.dp(f7), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(x3Var.getTitle());
            if (z10) {
                f10 = 32.0f;
            } else {
                f10 = 0.0f;
            }
            g5Var2.addView(textView, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, f10, 0.0f));
            x3Var.f8403i0 = g5Var2;
            g5Var = g5Var2;
        } else {
            g5Var = new s3(x3Var.getContext(), x3Var.f8392b, x3Var.O, x3Var.M);
        }
        return new s4.c1(g5Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10;
        x3 x3Var = this.f7851c;
        ArrayList arrayList = x3Var.f8402h0;
        if (c1Var.f45770f == 2) {
            s3 s3Var = (s3) c1Var.f45766a;
            Object obj = s3Var.S;
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (arrayList.isEmpty() && !x3Var.Q) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                s3Var.f(arrayList.indexOf(photoEntry), z10, false);
                return;
            }
            s3Var.f(-1, false, false);
        }
    }
}
