package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.a;
import org.telegram.tgnet.tl.TL_wallet;
public final class r43 implements Runnable {
    public final byte a;
    public final s43 b;
    public final TL_wallet.currencyRates c;

    public r43(s43 s43Var, TL_wallet.currencyRates currencyrates, byte b) {
        this.a = b;
        this.b = s43Var;
        this.c = currencyrates;
    }

    @Override
    public final void run() {
        byte b;
        boolean z;
        String str;
        switch (this.a) {
            case 0:
                s43 s43Var = this.b;
                TL_wallet.currencyRates currencyrates = this.c;
                boolean z2 = true;
                if (currencyrates != null && currencyrates.rates != null) {
                    try {
                        InputStream open = a.b.getAssets().open("currencies.json");
                        String str2 = gcc.a;
                        JSONObject jSONObject = new JSONObject(new String(j51.b(open), lk1.a));
                        ArrayList<TL_wallet.currencyRate> arrayList = currencyrates.rates;
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            TL_wallet.currencyRate currencyrate = arrayList.get(i);
                            i++;
                            TL_wallet.currencyRate currencyrate2 = currencyrate;
                            if (currencyrate2 != null) {
                                JSONObject optJSONObject = jSONObject.optJSONObject(currencyrate2.currency);
                                if (optJSONObject == null) {
                                    String str3 = currencyrate2.currency;
                                    currencyrate2.title = str3;
                                    currencyrate2.symbol = str3;
                                    currencyrate2.thousandsSeparator = ",";
                                    currencyrate2.decimalSeparator = ".";
                                    currencyrate2.spaceBetween = z2;
                                    currencyrate2.exp = 2;
                                } else {
                                    currencyrate2.title = optJSONObject.optString("title", currencyrate2.currency);
                                    String optString = optJSONObject.optString("native", currencyrate2.currency);
                                    String optString2 = optJSONObject.optString("symbol", currencyrate2.currency);
                                    if (("$".equals(optString) && !"USD".equals(currencyrate2.currency)) || "kr".equals(optString)) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if ("AED".equals(currencyrate2.currency)) {
                                        str = "\u20c3";
                                    } else if ("GEL".equals(currencyrate2.currency)) {
                                        str = "₾";
                                    } else if (z) {
                                        str = optString2;
                                    } else {
                                        str = optString;
                                    }
                                    currencyrate2.symbol = str;
                                    currencyrate2.thousandsSeparator = optJSONObject.optString("thousands_sep", ",");
                                    currencyrate2.decimalSeparator = optJSONObject.optString("decimal_sep", ".");
                                    currencyrate2.symbolLeft = optJSONObject.optBoolean("symbol_left");
                                    currencyrate2.spaceBetween = optJSONObject.optBoolean("space_between");
                                    currencyrate2.dropZeros = optJSONObject.optBoolean("drop_zeros");
                                    currencyrate2.exp = optJSONObject.optInt("exp", 2);
                                    if ("AED".equals(currencyrate2.currency)) {
                                        currencyrate2.title = currencyrate2.title.replace("United Arab Emirates", "UAE");
                                    } else if ("USD".equalsIgnoreCase(currencyrate2.currency)) {
                                        currencyrate2.title = currencyrate2.title.replace("United States", "US");
                                    }
                                    z2 = true;
                                }
                            }
                        }
                        open.close();
                        b = 1;
                    } catch (Exception e) {
                        b = 1;
                        cc4.g(e, true);
                    }
                } else {
                    b = 1;
                }
                hl.c3(new r43(s43Var, currencyrates, b));
                return;
            default:
                s43 s43Var2 = this.b;
                s43Var2.d = this.c;
                s43Var2.c = false;
                s43Var2.b.T();
                return;
        }
    }
}
