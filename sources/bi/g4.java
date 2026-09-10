package bi;

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
import org.telegram.messenger.em;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.vl0;
public final class g4 extends dl0 {
    public final p4 f2742c;

    public g4(p4 p4Var) {
        this.f2742c = p4Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f41613f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        MediaController.PhotoEntry photoEntry;
        int i11 = i10 - 2;
        p4 p4Var = this.f2742c;
        if (p4Var.f3373c0) {
            if (i11 == 0) {
                return null;
            }
            i11 = i10 - 3;
        } else if (p4Var.f3374d0) {
            if (i11 >= 0 && i11 < p4Var.f3371b0.size()) {
                return LocaleController.formatYearMont(((r9) p4Var.f3371b0.get(i11)).d / 1000, true);
            }
            i11 -= p4Var.f3371b0.size();
        }
        ArrayList arrayList = p4Var.f3377f0;
        if (arrayList == null || i11 < 0 || i11 >= arrayList.size() || (photoEntry = (MediaController.PhotoEntry) p4Var.f3377f0.get(i11)) == null) {
            return null;
        }
        long j3 = photoEntry.dateTaken;
        if (Build.VERSION.SDK_INT <= 28) {
            j3 /= 1000;
        }
        return LocaleController.formatYearMont(j3, true);
    }

    @Override
    public final void G(vl0 vl0Var, float f7, int[] iArr) {
        int i10;
        int k10 = k();
        p4 p4Var = this.f2742c;
        x3 x3Var = p4Var.e;
        float f10 = x3Var.J;
        int width = (int) (((int) (((vl0Var.getWidth() - vl0Var.getPaddingLeft()) - vl0Var.getPaddingRight()) / f10)) * p4Var.O);
        int ceil = (int) Math.ceil(k10 / f10);
        float lerp = (AndroidUtilities.lerp(0, Math.max(0, i10 - ((AndroidUtilities.displaySize.y - vl0Var.getPaddingTop()) - vl0Var.getPaddingBottom())), f7) / (ceil * width)) * ceil;
        int round = Math.round(lerp);
        iArr[0] = Math.max(0, x3Var.J * round) + 2;
        iArr[1] = vl0Var.getPaddingTop() + ((int) ((lerp - round) * width));
    }

    @Override
    public final float H(vl0 vl0Var) {
        p4 p4Var;
        int k10 = k();
        float f7 = this.f2742c.e.J;
        return (Math.max(0, vl0Var.computeVerticalScrollOffset() - p4Var.getPadding()) - vl0Var.getPaddingTop()) / ((((int) Math.ceil(k10 / f7)) * ((int) (((int) (((vl0Var.getWidth() - vl0Var.getPaddingLeft()) - vl0Var.getPaddingRight()) / f7)) * p4Var.O))) - (AndroidUtilities.displaySize.y - vl0Var.getPaddingTop()));
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
        p4 p4Var = this.f2742c;
        ArrayList arrayList = p4Var.f3377f0;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        if (p4Var.f3373c0) {
            return size + 1;
        }
        if (p4Var.f3374d0) {
            return p4Var.f3371b0.size() + size;
        }
        return size;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        p4 p4Var = this.f2742c;
        ArrayList arrayList = p4Var.f3379h0;
        ArrayList arrayList2 = p4Var.f3371b0;
        int i11 = c1Var.f41613f;
        View view = c1Var.f41610a;
        int i12 = -1;
        if (i11 == 0) {
            k4 k4Var = (k4) view;
            if (i10 == 0) {
                i12 = p4Var.getPadding();
            }
            k4Var.f2985a = i12;
        } else if (i11 == 2) {
            j4 j4Var = (j4) view;
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
            j4Var.U = z10;
            j4Var.V = z11;
            j4Var.M = new f4(this, j4Var, 0);
            j4Var.N = new f4(this, j4Var, 1);
            int i13 = i10 - 2;
            if (p4Var.f3373c0) {
                if (i13 == 0) {
                    j4Var.f(-1, false, false);
                    j4Var.e(arrayList2.size(), (r9) arrayList2.get(0));
                    return;
                }
                i13 = i10 - 3;
            } else if (p4Var.f3374d0) {
                if (i13 >= 0 && i13 < arrayList2.size()) {
                    j4Var.f(-1, false, false);
                    j4Var.e(0, (r9) arrayList2.get(i13));
                    return;
                }
                i13 -= arrayList2.size();
            }
            ArrayList arrayList3 = p4Var.f3377f0;
            if (arrayList3 != null && i13 >= 0 && i13 < arrayList3.size()) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) p4Var.f3377f0.get(i13);
                if (arrayList.isEmpty() && !p4Var.Q) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                int indexOf = arrayList.indexOf(photoEntry);
                if (j4Var.S != photoEntry) {
                    z13 = false;
                }
                j4Var.f(indexOf, z12, z13);
                j4Var.S = photoEntry;
                if (photoEntry != null && photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                    str = AndroidUtilities.formatShortDuration(photoEntry.duration);
                } else {
                    str = null;
                }
                j4Var.g(str);
                j4Var.F = null;
                if (photoEntry == null) {
                    j4Var.O = null;
                } else if (photoEntry.isVideo) {
                    StringBuilder sb2 = new StringBuilder();
                    em.l(R.string.AttachVideo, ", ", sb2);
                    sb2.append(LocaleController.formatDuration(photoEntry.duration));
                    j4Var.O = sb2.toString();
                } else {
                    j4Var.O = LocaleController.getString(R.string.AttachPhoto);
                }
                j4Var.b(photoEntry);
                j4Var.invalidate();
                if (p4Var.M) {
                    j4Var.I.setOnClickListener(new q(this, photoEntry, j4Var, 1));
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        float f7;
        float f10;
        l4 l4Var;
        p4 p4Var = this.f2742c;
        if (i10 == 0) {
            l4Var = new k4(p4Var, p4Var.getContext());
        } else if (i10 == 1) {
            Context context = p4Var.getContext();
            boolean z10 = p4Var.L;
            l4 l4Var2 = new l4(context, 0);
            if (z10) {
                f7 = 14.0f;
            } else {
                f7 = 16.0f;
            }
            l4Var2.setPadding(AndroidUtilities.dp(f7), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(p4Var.getTitle());
            if (z10) {
                f10 = 32.0f;
            } else {
                f10 = 0.0f;
            }
            l4Var2.addView(textView, w7.a6.d(-1, -1.0f, 119, 0.0f, 0.0f, f10, 0.0f));
            p4Var.f3380i0 = l4Var2;
            l4Var = l4Var2;
        } else {
            l4Var = new j4(p4Var.getContext(), p4Var.f3370b, p4Var.O, p4Var.M);
        }
        return new s4.c1(l4Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10;
        p4 p4Var = this.f2742c;
        ArrayList arrayList = p4Var.f3379h0;
        if (c1Var.f41613f == 2) {
            j4 j4Var = (j4) c1Var.f41610a;
            Object obj = j4Var.S;
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (arrayList.isEmpty() && !p4Var.Q) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                j4Var.f(arrayList.indexOf(photoEntry), z10, false);
                return;
            }
            j4Var.f(-1, false, false);
        }
    }
}
