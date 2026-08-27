package lh;

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
import org.telegram.messenger.rl;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.zk0;

public final class i3 extends jk0 {

    public final p3 f16106c;

    public i3(p3 p3Var) {
        this.f16106c = p3Var;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f5793f == 2;
    }

    @Override
    public final String F(int i10) {
        MediaController.PhotoEntry photoEntry;
        int size = i10 - 2;
        p3 p3Var = this.f16106c;
        if (p3Var.V) {
            if (size == 0) {
                return null;
            }
            size = i10 - 3;
        } else if (p3Var.W) {
            if (size >= 0 && size < p3Var.U.size()) {
                return LocaleController.formatYearMont(((z7) p3Var.U.get(size)).d / 1000, true);
            }
            size -= p3Var.U.size();
        }
        ArrayList arrayList = p3Var.f16510b0;
        if (arrayList == null || size < 0 || size >= arrayList.size() || (photoEntry = (MediaController.PhotoEntry) p3Var.f16510b0.get(size)) == null) {
            return null;
        }
        long j10 = photoEntry.dateTaken;
        if (Build.VERSION.SDK_INT <= 28) {
            j10 /= 1000;
        }
        return LocaleController.formatYearMont(j10, true);
    }

    @Override
    public final void G(zk0 zk0Var, float f10, int[] iArr) {
        int iK = k();
        float width = (zk0Var.getWidth() - zk0Var.getPaddingLeft()) - zk0Var.getPaddingRight();
        p3 p3Var = this.f16106c;
        z2 z2Var = p3Var.f16514e;
        float f11 = z2Var.J;
        int i10 = (int) (((int) (width / f11)) * p3Var.K);
        int iCeil = (int) Math.ceil(iK / f11);
        int i11 = iCeil * i10;
        float fLerp = (AndroidUtilities.lerp(0, Math.max(0, i11 - ((AndroidUtilities.displaySize.y - zk0Var.getPaddingTop()) - zk0Var.getPaddingBottom())), f10) / i11) * iCeil;
        int iRound = Math.round(fLerp);
        iArr[0] = Math.max(0, z2Var.J * iRound) + 2;
        iArr[1] = zk0Var.getPaddingTop() + ((int) ((fLerp - iRound) * i10));
    }

    @Override
    public final float H(zk0 zk0Var) {
        int iK = k();
        float width = (zk0Var.getWidth() - zk0Var.getPaddingLeft()) - zk0Var.getPaddingRight();
        p3 p3Var = this.f16106c;
        float f10 = p3Var.f16514e.J;
        return (Math.max(0, zk0Var.computeVerticalScrollOffset() - p3Var.getPadding()) - zk0Var.getPaddingTop()) / ((((int) Math.ceil(iK / f10)) * ((int) (((int) (width / f10)) * p3Var.K))) - (AndroidUtilities.displaySize.y - zk0Var.getPaddingTop()));
    }

    @Override
    public final int h() {
        return k() + 3;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0 || i10 == h() - 1) {
            return 0;
        }
        return i10 == 1 ? 1 : 2;
    }

    @Override
    public final int k() {
        p3 p3Var = this.f16106c;
        ArrayList arrayList = p3Var.f16510b0;
        int size = arrayList == null ? 0 : arrayList.size();
        if (p3Var.V) {
            return size + 1;
        }
        return p3Var.W ? p3Var.U.size() + size : size;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        p3 p3Var = this.f16106c;
        ArrayList arrayList = p3Var.f16513d0;
        ArrayList arrayList2 = p3Var.U;
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i11 == 0) {
            ((m3) view).f16378a = i10 == 0 ? p3Var.getPadding() : -1;
            return;
        }
        if (i11 == 2) {
            l3 l3Var = (l3) view;
            boolean z10 = i10 == 2;
            boolean z11 = i10 == 4;
            l3Var.Q = z10;
            l3Var.R = z11;
            l3Var.I = new h3(this, l3Var, 0);
            l3Var.J = new h3(this, l3Var, 1);
            int size = i10 - 2;
            if (p3Var.V) {
                if (size == 0) {
                    l3Var.f(-1, false, false);
                    l3Var.e(arrayList2.size(), (z7) arrayList2.get(0));
                    return;
                }
                size = i10 - 3;
            } else if (p3Var.W) {
                if (size >= 0 && size < arrayList2.size()) {
                    l3Var.f(-1, false, false);
                    l3Var.e(0, (z7) arrayList2.get(size));
                    return;
                }
                size -= arrayList2.size();
            }
            ArrayList arrayList3 = p3Var.f16510b0;
            if (arrayList3 == null || size < 0 || size >= arrayList3.size()) {
                return;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) p3Var.f16510b0.get(size);
            l3Var.f(arrayList.indexOf(photoEntry), !arrayList.isEmpty() || p3Var.M, l3Var.O == photoEntry);
            l3Var.O = photoEntry;
            l3Var.g((photoEntry == null || !photoEntry.isVideo || photoEntry.isLivePhoto()) ? null : AndroidUtilities.formatShortDuration(photoEntry.duration));
            l3Var.B = null;
            if (photoEntry == null) {
                l3Var.K = null;
            } else if (photoEntry.isVideo) {
                StringBuilder sb2 = new StringBuilder();
                rl.j(R.string.AttachVideo, ", ", sb2);
                sb2.append(LocaleController.formatDuration(photoEntry.duration));
                l3Var.K = sb2.toString();
            } else {
                l3Var.K = LocaleController.getString(R.string.AttachPhoto);
            }
            l3Var.b(photoEntry);
            l3Var.invalidate();
            if (p3Var.I) {
                l3Var.E.setOnClickListener(new gg.f(this, photoEntry, l3Var, 14));
            }
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View l3Var;
        p3 p3Var = this.f16106c;
        if (i10 == 0) {
            l3Var = new m3(p3Var, p3Var.getContext());
        } else if (i10 == 1) {
            Context context = p3Var.getContext();
            boolean z10 = p3Var.H;
            ag.d dVar = new ag.d(context, 3);
            dVar.setPadding(AndroidUtilities.dp(z10 ? 14.0f : 16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(p3Var.getTitle());
            dVar.addView(textView, h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, z10 ? 32.0f : 0.0f, 0.0f));
            p3Var.f16515e0 = dVar;
            l3Var = dVar;
        } else {
            l3Var = new l3(p3Var.getContext(), p3Var.f16509b, p3Var.K, p3Var.I);
        }
        return new lk0(l3Var);
    }

    @Override
    public final void y(f2.o1 o1Var) {
        p3 p3Var = this.f16106c;
        ArrayList arrayList = p3Var.f16513d0;
        if (o1Var.f5793f == 2) {
            l3 l3Var = (l3) o1Var.f5789a;
            Object obj = l3Var.O;
            if (!(obj instanceof MediaController.PhotoEntry)) {
                l3Var.f(-1, false, false);
            } else {
                l3Var.f(arrayList.indexOf((MediaController.PhotoEntry) obj), !arrayList.isEmpty() || p3Var.M, false);
            }
        }
    }
}
