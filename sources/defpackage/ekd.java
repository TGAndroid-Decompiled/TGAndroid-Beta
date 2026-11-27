package defpackage;

import android.os.Parcel;
public final class ekd {
    public byte a;
    public Object b;

    public ekd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final String a(ybf ybfVar) {
        String str;
        cnd cndVar = (cnd) this.b;
        byte b = this.a;
        try {
            if (cndVar.E != null) {
                sed sedVar = cndVar.E;
                String packageName = cndVar.C.getPackageName();
                if (b != 2) {
                    if (b != 3) {
                        if (b != 4) {
                            if (b != 5) {
                                if (b != 6) {
                                    str = "QUERY_PRODUCT_DETAILS_ASYNC";
                                } else {
                                    str = "START_CONNECTION";
                                }
                            } else {
                                str = "IS_FEATURE_SUPPORTED";
                            }
                        } else {
                            str = "CONSUME_ASYNC";
                        }
                    } else {
                        str = "ACKNOWLEDGE_PURCHASE";
                    }
                } else {
                    str = "LAUNCH_BILLING_FLOW";
                }
                mmd mmdVar = new mmd(ybfVar);
                wdd wddVar = (wdd) sedVar;
                Parcel X = wddVar.X();
                X.writeString(packageName);
                X.writeString(str);
                int i = udd.a;
                X.writeStrongBinder(mmdVar);
                wddVar.b.transact(1, X, null, 1);
                X.recycle();
                return "billingOverrideService.getBillingOverride";
            }
            throw null;
        } catch (Exception e) {
            cndVar.E(95, 28, hod.p);
            old.i("BillingClientTesting", "An error occurred while retrieving billing override.", e);
            ybfVar.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }
}
