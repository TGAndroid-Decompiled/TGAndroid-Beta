package bb;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Rating;
import android.os.Bundle;
import n4.h0;
import n4.n;
public final class a {
    public final Bundle f3802a;

    public a(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f3802a = bundle == null ? Bundle.EMPTY : bundle;
    }

    public Boolean a() {
        Bundle bundle = this.f3802a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    public void b(String str, Bitmap bitmap) {
        Integer num = (Integer) n.f16334c.get(str);
        if (num != null && num.intValue() != 2) {
            throw new IllegalArgumentException(a1.g.q("The ", str, " key cannot be used to put a Bitmap"));
        }
        this.f3802a.putParcelable(str, bitmap);
    }

    public void c(long j3, String str) {
        Integer num = (Integer) n.f16334c.get(str);
        if (num != null && num.intValue() != 0) {
            throw new IllegalArgumentException(a1.g.q("The ", str, " key cannot be used to put a long"));
        }
        this.f3802a.putLong(str, j3);
    }

    public void d(String str, h0 h0Var) {
        Rating rating;
        float f7 = h0Var.f16318b;
        int i10 = h0Var.f16317a;
        Integer num = (Integer) n.f16334c.get(str);
        if (num != null && num.intValue() != 3) {
            throw new IllegalArgumentException(a1.g.q("The ", str, " key cannot be used to put a Rating"));
        }
        if (h0Var.f16319c == null) {
            if (h0Var.b()) {
                boolean z10 = true;
                switch (i10) {
                    case 1:
                        if (i10 != 1 || f7 != 1.0f) {
                            z10 = false;
                        }
                        h0Var.f16319c = Rating.newHeartRating(z10);
                        break;
                    case 2:
                        if (i10 != 2 || f7 != 1.0f) {
                            z10 = false;
                        }
                        h0Var.f16319c = Rating.newThumbRating(z10);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        h0Var.f16319c = Rating.newStarRating(i10, h0Var.a());
                        break;
                    case 6:
                        h0Var.f16319c = Rating.newPercentageRating((i10 == 6 && h0Var.b()) ? -1.0f : -1.0f);
                        break;
                    default:
                        rating = null;
                        break;
                }
                this.f3802a.putParcelable(str, rating);
            }
            h0Var.f16319c = Rating.newUnratedRating(i10);
        }
        rating = h0Var.f16319c;
        this.f3802a.putParcelable(str, rating);
    }

    public void e(String str, String str2) {
        Integer num = (Integer) n.f16334c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a1.g.q("The ", str, " key cannot be used to put a String"));
        }
        this.f3802a.putCharSequence(str, str2);
    }

    public void f(CharSequence charSequence, String str) {
        Integer num = (Integer) n.f16334c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a1.g.q("The ", str, " key cannot be used to put a CharSequence"));
        }
        this.f3802a.putCharSequence(str, charSequence);
    }

    public a() {
        this.f3802a = new Bundle();
    }
}
