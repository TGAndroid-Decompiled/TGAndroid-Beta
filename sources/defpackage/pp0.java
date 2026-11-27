package defpackage;

import android.text.style.ClickableSpan;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class pp0 implements icc {
    public final byte a;

    public pp0(byte b) {
        this.a = b;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                return;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                l9c l9cVar = (l9c) obj2;
                ArrayList m = a5c.m();
                int size = m.size();
                int i = 0;
                while (i < size) {
                    Object obj3 = m.get(i);
                    i++;
                    int i2 = hr0.b;
                    b8c K = b8c.K(hr0.class);
                    K.H = (t4c) obj3;
                    arrayList.add(K);
                }
                return;
            case 2:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                return;
            case 3:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                return;
            default:
                Boolean bool2 = (Boolean) obj;
                HashSet<Long> hashSet = (HashSet) obj2;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.convertToConferenceCall(bool2.booleanValue(), hashSet);
                    return;
                }
                return;
        }
    }

    public pp0(Object obj, byte b) {
        this.a = b;
    }
}
