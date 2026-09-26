package ci;

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
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.xl0;
public final class o3 extends fl0 {
    public final w3 f5238c;

    public o3(w3 w3Var) {
        this.f5238c = w3Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42962f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        MediaController.PhotoEntry photoEntry;
        int i11 = i10 - 2;
        w3 w3Var = this.f5238c;
        if (w3Var.f5709c0) {
            if (i11 == 0) {
                return null;
            }
            i11 = i10 - 3;
        } else if (w3Var.f5710d0) {
            if (i11 >= 0 && i11 < w3Var.f5707b0.size()) {
                return LocaleController.formatYearMont(((l8) w3Var.f5707b0.get(i11)).d / 1000, true);
            }
            i11 -= w3Var.f5707b0.size();
        }
        ArrayList arrayList = w3Var.f5713f0;
        if (arrayList == null || i11 < 0 || i11 >= arrayList.size() || (photoEntry = (MediaController.PhotoEntry) w3Var.f5713f0.get(i11)) == null) {
            return null;
        }
        long j3 = photoEntry.dateTaken;
        if (Build.VERSION.SDK_INT <= 28) {
            j3 /= 1000;
        }
        return LocaleController.formatYearMont(j3, true);
    }

    @Override
    public final void G(xl0 xl0Var, float f7, int[] iArr) {
        int i10;
        int k10 = k();
        w3 w3Var = this.f5238c;
        f3 f3Var = w3Var.e;
        float f10 = f3Var.J;
        int width = (int) (((int) (((xl0Var.getWidth() - xl0Var.getPaddingLeft()) - xl0Var.getPaddingRight()) / f10)) * w3Var.O);
        int ceil = (int) Math.ceil(k10 / f10);
        float lerp = (AndroidUtilities.lerp(0, Math.max(0, i10 - ((AndroidUtilities.displaySize.y - xl0Var.getPaddingTop()) - xl0Var.getPaddingBottom())), f7) / (ceil * width)) * ceil;
        int round = Math.round(lerp);
        iArr[0] = Math.max(0, f3Var.J * round) + 2;
        iArr[1] = xl0Var.getPaddingTop() + ((int) ((lerp - round) * width));
    }

    @Override
    public final float H(xl0 xl0Var) {
        w3 w3Var;
        int k10 = k();
        float f7 = this.f5238c.e.J;
        return (Math.max(0, xl0Var.computeVerticalScrollOffset() - w3Var.getPadding()) - xl0Var.getPaddingTop()) / ((((int) Math.ceil(k10 / f7)) * ((int) (((int) (((xl0Var.getWidth() - xl0Var.getPaddingLeft()) - xl0Var.getPaddingRight()) / f7)) * w3Var.O))) - (AndroidUtilities.displaySize.y - xl0Var.getPaddingTop()));
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
        w3 w3Var = this.f5238c;
        ArrayList arrayList = w3Var.f5713f0;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        if (w3Var.f5709c0) {
            return size + 1;
        }
        if (w3Var.f5710d0) {
            return w3Var.f5707b0.size() + size;
        }
        return size;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        w3 w3Var = this.f5238c;
        ArrayList arrayList = w3Var.f5715h0;
        ArrayList arrayList2 = w3Var.f5707b0;
        int i11 = c1Var.f42962f;
        View view = c1Var.f42959a;
        int i12 = -1;
        if (i11 == 0) {
            s3 s3Var = (s3) view;
            if (i10 == 0) {
                i12 = w3Var.getPadding();
            }
            s3Var.f5481a = i12;
        } else if (i11 == 2) {
            r3 r3Var = (r3) view;
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
            r3Var.U = z10;
            r3Var.V = z11;
            r3Var.M = new n3(this, r3Var, 0);
            r3Var.N = new n3(this, r3Var, 1);
            int i13 = i10 - 2;
            if (w3Var.f5709c0) {
                if (i13 == 0) {
                    r3Var.f(-1, false, false);
                    r3Var.e(arrayList2.size(), (l8) arrayList2.get(0));
                    return;
                }
                i13 = i10 - 3;
            } else if (w3Var.f5710d0) {
                if (i13 >= 0 && i13 < arrayList2.size()) {
                    r3Var.f(-1, false, false);
                    r3Var.e(0, (l8) arrayList2.get(i13));
                    return;
                }
                i13 -= arrayList2.size();
            }
            ArrayList arrayList3 = w3Var.f5713f0;
            if (arrayList3 != null && i13 >= 0 && i13 < arrayList3.size()) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) w3Var.f5713f0.get(i13);
                if (arrayList.isEmpty() && !w3Var.Q) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                int indexOf = arrayList.indexOf(photoEntry);
                if (r3Var.S != photoEntry) {
                    z13 = false;
                }
                r3Var.f(indexOf, z12, z13);
                r3Var.S = photoEntry;
                if (photoEntry != null && photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                    str = AndroidUtilities.formatShortDuration(photoEntry.duration);
                } else {
                    str = null;
                }
                r3Var.g(str);
                r3Var.F = null;
                if (photoEntry == null) {
                    r3Var.O = null;
                } else if (photoEntry.isVideo) {
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.Cells.c1.n(R.string.AttachVideo, ", ", sb2);
                    sb2.append(LocaleController.formatDuration(photoEntry.duration));
                    r3Var.O = sb2.toString();
                } else {
                    r3Var.O = LocaleController.getString(R.string.AttachPhoto);
                }
                r3Var.b(photoEntry);
                r3Var.invalidate();
                if (w3Var.M) {
                    r3Var.I.setOnClickListener(new ai.d0(this, photoEntry, r3Var, 5));
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        float f7;
        float f10;
        ai.w5 w5Var;
        w3 w3Var = this.f5238c;
        if (i10 == 0) {
            w5Var = new s3(w3Var, w3Var.getContext());
        } else if (i10 == 1) {
            Context context = w3Var.getContext();
            boolean z10 = w3Var.L;
            ai.w5 w5Var2 = new ai.w5(context, 1);
            if (z10) {
                f7 = 14.0f;
            } else {
                f7 = 16.0f;
            }
            w5Var2.setPadding(AndroidUtilities.dp(f7), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(w3Var.getTitle());
            if (z10) {
                f10 = 32.0f;
            } else {
                f10 = 0.0f;
            }
            w5Var2.addView(textView, w7.y5.d(-1, -1.0f, 119, 0.0f, 0.0f, f10, 0.0f));
            w3Var.f5716i0 = w5Var2;
            w5Var = w5Var2;
        } else {
            w5Var = new r3(w3Var.getContext(), w3Var.f5706b, w3Var.O, w3Var.M);
        }
        return new s4.c1(w5Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10;
        w3 w3Var = this.f5238c;
        ArrayList arrayList = w3Var.f5715h0;
        if (c1Var.f42962f == 2) {
            r3 r3Var = (r3) c1Var.f42959a;
            Object obj = r3Var.S;
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (arrayList.isEmpty() && !w3Var.Q) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                r3Var.f(arrayList.indexOf(photoEntry), z10, false);
                return;
            }
            r3Var.f(-1, false, false);
        }
    }
}
