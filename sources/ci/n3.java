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
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.sm0;
public final class n3 extends am0 {
    public final v3 f5631c;

    public n3(v3 v3Var) {
        this.f5631c = v3Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47752f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        MediaController.PhotoEntry photoEntry;
        int i11 = i10 - 2;
        v3 v3Var = this.f5631c;
        if (v3Var.f6132c0) {
            if (i11 == 0) {
                return null;
            }
            i11 = i10 - 3;
        } else if (v3Var.f6133d0) {
            if (i11 >= 0 && i11 < v3Var.f6130b0.size()) {
                return LocaleController.formatYearMont(((l8) v3Var.f6130b0.get(i11)).d / 1000, true);
            }
            i11 -= v3Var.f6130b0.size();
        }
        ArrayList arrayList = v3Var.f6137f0;
        if (arrayList == null || i11 < 0 || i11 >= arrayList.size() || (photoEntry = (MediaController.PhotoEntry) v3Var.f6137f0.get(i11)) == null) {
            return null;
        }
        long j3 = photoEntry.dateTaken;
        if (Build.VERSION.SDK_INT <= 28) {
            j3 /= 1000;
        }
        return LocaleController.formatYearMont(j3, true);
    }

    @Override
    public final void G(sm0 sm0Var, float f7, int[] iArr) {
        int i10;
        int k10 = k();
        v3 v3Var = this.f5631c;
        e3 e3Var = v3Var.f6134e;
        float f10 = e3Var.J;
        int width = (int) (((int) (((sm0Var.getWidth() - sm0Var.getPaddingLeft()) - sm0Var.getPaddingRight()) / f10)) * v3Var.O);
        int ceil = (int) Math.ceil(k10 / f10);
        float lerp = (AndroidUtilities.lerp(0, Math.max(0, i10 - ((AndroidUtilities.displaySize.y - sm0Var.getPaddingTop()) - sm0Var.getPaddingBottom())), f7) / (ceil * width)) * ceil;
        int round = Math.round(lerp);
        iArr[0] = Math.max(0, e3Var.J * round) + 2;
        iArr[1] = sm0Var.getPaddingTop() + ((int) ((lerp - round) * width));
    }

    @Override
    public final float H(sm0 sm0Var) {
        v3 v3Var;
        int k10 = k();
        float f7 = this.f5631c.f6134e.J;
        return (Math.max(0, sm0Var.computeVerticalScrollOffset() - v3Var.getPadding()) - sm0Var.getPaddingTop()) / ((((int) Math.ceil(k10 / f7)) * ((int) (((int) (((sm0Var.getWidth() - sm0Var.getPaddingLeft()) - sm0Var.getPaddingRight()) / f7)) * v3Var.O))) - (AndroidUtilities.displaySize.y - sm0Var.getPaddingTop()));
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
        v3 v3Var = this.f5631c;
        ArrayList arrayList = v3Var.f6137f0;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        if (v3Var.f6132c0) {
            return size + 1;
        }
        if (v3Var.f6133d0) {
            return v3Var.f6130b0.size() + size;
        }
        return size;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        v3 v3Var = this.f5631c;
        ArrayList arrayList = v3Var.f6139h0;
        ArrayList arrayList2 = v3Var.f6130b0;
        int i11 = d1Var.f47752f;
        View view = d1Var.f47748a;
        int i12 = -1;
        if (i11 == 0) {
            r3 r3Var = (r3) view;
            if (i10 == 0) {
                i12 = v3Var.getPadding();
            }
            r3Var.f5891a = i12;
        } else if (i11 == 2) {
            q3 q3Var = (q3) view;
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
            q3Var.U = z10;
            q3Var.V = z11;
            q3Var.M = new m3(this, q3Var, 0);
            q3Var.N = new m3(this, q3Var, 1);
            int i13 = i10 - 2;
            if (v3Var.f6132c0) {
                if (i13 == 0) {
                    q3Var.f(-1, false, false);
                    q3Var.e(arrayList2.size(), (l8) arrayList2.get(0));
                    return;
                }
                i13 = i10 - 3;
            } else if (v3Var.f6133d0) {
                if (i13 >= 0 && i13 < arrayList2.size()) {
                    q3Var.f(-1, false, false);
                    q3Var.e(0, (l8) arrayList2.get(i13));
                    return;
                }
                i13 -= arrayList2.size();
            }
            ArrayList arrayList3 = v3Var.f6137f0;
            if (arrayList3 != null && i13 >= 0 && i13 < arrayList3.size()) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) v3Var.f6137f0.get(i13);
                if (arrayList.isEmpty() && !v3Var.Q) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                int indexOf = arrayList.indexOf(photoEntry);
                if (q3Var.S != photoEntry) {
                    z13 = false;
                }
                q3Var.f(indexOf, z12, z13);
                q3Var.S = photoEntry;
                if (photoEntry != null && photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                    str = AndroidUtilities.formatShortDuration(photoEntry.duration);
                } else {
                    str = null;
                }
                q3Var.g(str);
                q3Var.F = null;
                if (photoEntry == null) {
                    q3Var.O = null;
                } else if (photoEntry.isVideo) {
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.Cells.c1.l(R.string.AttachVideo, ", ", sb2);
                    sb2.append(LocaleController.formatDuration(photoEntry.duration));
                    q3Var.O = sb2.toString();
                } else {
                    q3Var.O = LocaleController.getString(R.string.AttachPhoto);
                }
                q3Var.b(photoEntry);
                q3Var.invalidate();
                if (v3Var.M) {
                    q3Var.I.setOnClickListener(new ai.d0(this, photoEntry, q3Var, 5));
                }
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        float f7;
        float f10;
        ai.x5 x5Var;
        v3 v3Var = this.f5631c;
        if (i10 == 0) {
            x5Var = new r3(v3Var, v3Var.getContext());
        } else if (i10 == 1) {
            Context context = v3Var.getContext();
            boolean z10 = v3Var.L;
            ai.x5 x5Var2 = new ai.x5(context, 1);
            if (z10) {
                f7 = 14.0f;
            } else {
                f7 = 16.0f;
            }
            x5Var2.setPadding(AndroidUtilities.dp(f7), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(v3Var.getTitle());
            if (z10) {
                f10 = 32.0f;
            } else {
                f10 = 0.0f;
            }
            x5Var2.addView(textView, w7.x5.a(-1.0f, 0.0f, 0.0f, f10, 0.0f, -1, 119));
            v3Var.f6140i0 = x5Var2;
            x5Var = x5Var2;
        } else {
            x5Var = new q3(v3Var.getContext(), v3Var.f6129b, v3Var.O, v3Var.M);
        }
        return new s4.d1(x5Var);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        boolean z10;
        v3 v3Var = this.f5631c;
        ArrayList arrayList = v3Var.f6139h0;
        if (d1Var.f47752f == 2) {
            q3 q3Var = (q3) d1Var.f47748a;
            Object obj = q3Var.S;
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (arrayList.isEmpty() && !v3Var.Q) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                q3Var.f(arrayList.indexOf(photoEntry), z10, false);
                return;
            }
            q3Var.f(-1, false, false);
        }
    }
}
