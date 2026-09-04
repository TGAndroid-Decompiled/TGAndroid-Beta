package bb;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Rating;
import android.os.Bundle;
import n4.i0;
public final class a {
    public final Bundle f2531a;

    public a(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f2531a = bundle == null ? Bundle.EMPTY : bundle;
    }

    public Boolean a() {
        Bundle bundle = this.f2531a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    public void b(String str, Bitmap bitmap) {
        Integer num = (Integer) n4.m.f16466c.get(str);
        if (num != null && num.intValue() != 2) {
            throw new IllegalArgumentException(a4.a.p("The ", str, " key cannot be used to put a Bitmap"));
        }
        this.f2531a.putParcelable(str, bitmap);
    }

    public void c(long j3, String str) {
        Integer num = (Integer) n4.m.f16466c.get(str);
        if (num != null && num.intValue() != 0) {
            throw new IllegalArgumentException(a4.a.p("The ", str, " key cannot be used to put a long"));
        }
        this.f2531a.putLong(str, j3);
    }

    public void d(String str, i0 i0Var) {
        Rating rating;
        float f7 = i0Var.f16453b;
        int i10 = i0Var.f16452a;
        Integer num = (Integer) n4.m.f16466c.get(str);
        if (num != null && num.intValue() != 3) {
            throw new IllegalArgumentException(a4.a.p("The ", str, " key cannot be used to put a Rating"));
        }
        if (i0Var.f16454c == null) {
            if (i0Var.b()) {
                boolean z10 = true;
                switch (i10) {
                    case 1:
                        if (i10 != 1 || f7 != 1.0f) {
                            z10 = false;
                        }
                        i0Var.f16454c = Rating.newHeartRating(z10);
                        break;
                    case 2:
                        if (i10 != 2 || f7 != 1.0f) {
                            z10 = false;
                        }
                        i0Var.f16454c = Rating.newThumbRating(z10);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        i0Var.f16454c = Rating.newStarRating(i10, i0Var.a());
                        break;
                    case 6:
                        i0Var.f16454c = Rating.newPercentageRating((i10 == 6 && i0Var.b()) ? -1.0f : -1.0f);
                        break;
                    default:
                        rating = null;
                        break;
                }
                this.f2531a.putParcelable(str, rating);
            }
            i0Var.f16454c = Rating.newUnratedRating(i10);
        }
        rating = i0Var.f16454c;
        this.f2531a.putParcelable(str, rating);
    }

    public void e(String str, String str2) {
        Integer num = (Integer) n4.m.f16466c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a4.a.p("The ", str, " key cannot be used to put a String"));
        }
        this.f2531a.putCharSequence(str, str2);
    }

    public void f(CharSequence charSequence, String str) {
        Integer num = (Integer) n4.m.f16466c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a4.a.p("The ", str, " key cannot be used to put a CharSequence"));
        }
        this.f2531a.putCharSequence(str, charSequence);
    }

    public a() {
        this.f2531a = new Bundle();
    }
}
