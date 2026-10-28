package fi;

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
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.ul0;
public final class h3 extends ul0 {
    public final o3 f10947c;

    public h3(o3 o3Var) {
        this.f10947c = o3Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47776f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        MediaController.PhotoEntry photoEntry;
        int i11 = i10 - 2;
        o3 o3Var = this.f10947c;
        if (o3Var.f11340c0) {
            if (i11 == 0) {
                return null;
            }
            i11 = i10 - 3;
        } else if (o3Var.f11341d0) {
            if (i11 >= 0 && i11 < o3Var.f11338b0.size()) {
                return LocaleController.formatYearMont(((w7) o3Var.f11338b0.get(i11)).d / 1000, true);
            }
            i11 -= o3Var.f11338b0.size();
        }
        ArrayList arrayList = o3Var.f11344f0;
        if (arrayList == null || i11 < 0 || i11 >= arrayList.size() || (photoEntry = (MediaController.PhotoEntry) o3Var.f11344f0.get(i11)) == null) {
            return null;
        }
        long j10 = photoEntry.dateTaken;
        if (Build.VERSION.SDK_INT <= 28) {
            j10 /= 1000;
        }
        return LocaleController.formatYearMont(j10, true);
    }

    @Override
    public final void G(nm0 nm0Var, float f7, int[] iArr) {
        int i10;
        int k10 = k();
        o3 o3Var = this.f10947c;
        y2 y2Var = o3Var.e;
        float f10 = y2Var.J;
        int width = (int) (((int) (((nm0Var.getWidth() - nm0Var.getPaddingLeft()) - nm0Var.getPaddingRight()) / f10)) * o3Var.O);
        int ceil = (int) Math.ceil(k10 / f10);
        float lerp = (AndroidUtilities.lerp(0, Math.max(0, i10 - ((AndroidUtilities.displaySize.y - nm0Var.getPaddingTop()) - nm0Var.getPaddingBottom())), f7) / (ceil * width)) * ceil;
        int round = Math.round(lerp);
        iArr[0] = Math.max(0, y2Var.J * round) + 2;
        iArr[1] = nm0Var.getPaddingTop() + ((int) ((lerp - round) * width));
    }

    @Override
    public final float H(nm0 nm0Var) {
        o3 o3Var;
        int k10 = k();
        float f7 = this.f10947c.e.J;
        return (Math.max(0, nm0Var.computeVerticalScrollOffset() - o3Var.getPadding()) - nm0Var.getPaddingTop()) / ((((int) Math.ceil(k10 / f7)) * ((int) (((int) (((nm0Var.getWidth() - nm0Var.getPaddingLeft()) - nm0Var.getPaddingRight()) / f7)) * o3Var.O))) - (AndroidUtilities.displaySize.y - nm0Var.getPaddingTop()));
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
        o3 o3Var = this.f10947c;
        ArrayList arrayList = o3Var.f11344f0;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        if (o3Var.f11340c0) {
            return size + 1;
        }
        if (o3Var.f11341d0) {
            return o3Var.f11338b0.size() + size;
        }
        return size;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        o3 o3Var = this.f10947c;
        ArrayList arrayList = o3Var.f11346h0;
        ArrayList arrayList2 = o3Var.f11338b0;
        int i11 = e1Var.f47776f;
        View view = e1Var.f47773a;
        int i12 = -1;
        if (i11 == 0) {
            l3 l3Var = (l3) view;
            if (i10 == 0) {
                i12 = o3Var.getPadding();
            }
            l3Var.f11164a = i12;
        } else if (i11 == 2) {
            k3 k3Var = (k3) view;
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
            k3Var.U = z10;
            k3Var.V = z11;
            k3Var.M = new g3(this, k3Var, 0);
            k3Var.N = new g3(this, k3Var, 1);
            int i13 = i10 - 2;
            if (o3Var.f11340c0) {
                if (i13 == 0) {
                    k3Var.f(-1, false, false);
                    k3Var.e(arrayList2.size(), (w7) arrayList2.get(0));
                    return;
                }
                i13 = i10 - 3;
            } else if (o3Var.f11341d0) {
                if (i13 >= 0 && i13 < arrayList2.size()) {
                    k3Var.f(-1, false, false);
                    k3Var.e(0, (w7) arrayList2.get(i13));
                    return;
                }
                i13 -= arrayList2.size();
            }
            ArrayList arrayList3 = o3Var.f11344f0;
            if (arrayList3 != null && i13 >= 0 && i13 < arrayList3.size()) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) o3Var.f11344f0.get(i13);
                if (arrayList.isEmpty() && !o3Var.Q) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                int indexOf = arrayList.indexOf(photoEntry);
                if (k3Var.S != photoEntry) {
                    z13 = false;
                }
                k3Var.f(indexOf, z12, z13);
                k3Var.S = photoEntry;
                if (photoEntry != null && photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                    str = AndroidUtilities.formatShortDuration(photoEntry.duration);
                } else {
                    str = null;
                }
                k3Var.g(str);
                k3Var.F = null;
                if (photoEntry == null) {
                    k3Var.O = null;
                } else if (photoEntry.isVideo) {
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.d3.p(R.string.AttachVideo, ", ", sb2);
                    sb2.append(LocaleController.formatDuration(photoEntry.duration));
                    k3Var.O = sb2.toString();
                } else {
                    k3Var.O = LocaleController.getString(R.string.AttachPhoto);
                }
                k3Var.b(photoEntry);
                k3Var.invalidate();
                if (o3Var.M) {
                    k3Var.I.setOnClickListener(new bi.w0(this, photoEntry, k3Var, 8));
                }
            }
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        float f7;
        float f10;
        di.i4 i4Var;
        o3 o3Var = this.f10947c;
        if (i10 == 0) {
            i4Var = new l3(o3Var, o3Var.getContext());
        } else if (i10 == 1) {
            Context context = o3Var.getContext();
            boolean z10 = o3Var.L;
            di.i4 i4Var2 = new di.i4(context, 1);
            if (z10) {
                f7 = 14.0f;
            } else {
                f7 = 16.0f;
            }
            i4Var2.setPadding(AndroidUtilities.dp(f7), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(o3Var.getTitle());
            if (z10) {
                f10 = 32.0f;
            } else {
                f10 = 0.0f;
            }
            i4Var2.addView(textView, kb1.h(-1, -1.0f, 119, 0.0f, 0.0f, f10, 0.0f));
            o3Var.f11347i0 = i4Var2;
            i4Var = i4Var2;
        } else {
            i4Var = new k3(o3Var.getContext(), o3Var.f11337b, o3Var.O, o3Var.M);
        }
        return new s4.e1(i4Var);
    }

    @Override
    public final void y(s4.e1 e1Var) {
        boolean z10;
        o3 o3Var = this.f10947c;
        ArrayList arrayList = o3Var.f11346h0;
        if (e1Var.f47776f == 2) {
            k3 k3Var = (k3) e1Var.f47773a;
            Object obj = k3Var.S;
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (arrayList.isEmpty() && !o3Var.Q) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                k3Var.f(arrayList.indexOf(photoEntry), z10, false);
                return;
            }
            k3Var.f(-1, false, false);
        }
    }
}
