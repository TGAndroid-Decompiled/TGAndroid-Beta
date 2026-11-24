package defpackage;

import android.os.Parcel;
public final class ohd {
    public byte a;
    public Object b;

    public ohd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final String a(j9f j9fVar) {
        String str;
        nkd nkdVar = (nkd) this.b;
        byte b = this.a;
        try {
            if (nkdVar.E != null) {
                bcd bcdVar = nkdVar.E;
                String packageName = nkdVar.C.getPackageName();
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
                wjd wjdVar = new wjd(j9fVar);
                fbd fbdVar = (fbd) bcdVar;
                Parcel X = fbdVar.X();
                X.writeString(packageName);
                X.writeString(str);
                int i = dbd.a;
                X.writeStrongBinder(wjdVar);
                fbdVar.b.transact(1, X, null, 1);
                X.recycle();
                return "billingOverrideService.getBillingOverride";
            }
            throw null;
        } catch (Exception e) {
            nkdVar.E(95, 28, sld.p);
            yid.i("BillingClientTesting", "An error occurred while retrieving billing override.", e);
            j9fVar.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }
}
