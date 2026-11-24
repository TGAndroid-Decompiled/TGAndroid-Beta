package defpackage;

import android.os.Parcel;
public final class nfd {
    public byte a;
    public Object b;

    public nfd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final String a(h7f h7fVar) {
        String str;
        lid lidVar = (lid) this.b;
        byte b = this.a;
        try {
            if (lidVar.E != null) {
                z9d z9dVar = lidVar.E;
                String packageName = lidVar.C.getPackageName();
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
                vhd vhdVar = new vhd(h7fVar);
                d9d d9dVar = (d9d) z9dVar;
                Parcel X = d9dVar.X();
                X.writeString(packageName);
                X.writeString(str);
                int i = b9d.a;
                X.writeStrongBinder(vhdVar);
                d9dVar.b.transact(1, X, null, 1);
                X.recycle();
                return "billingOverrideService.getBillingOverride";
            }
            throw null;
        } catch (Exception e) {
            lidVar.E(95, 28, qjd.p);
            xgd.i("BillingClientTesting", "An error occurred while retrieving billing override.", e);
            h7fVar.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }
}
