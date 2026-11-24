package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
public final class tpc implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public tpc(zsc zscVar, String str, mi5 mi5Var, ysc yscVar) {
        this.a = (byte) 4;
        this.b = zscVar;
        this.c = str;
        this.d = mi5Var;
        this.e = yscVar;
    }

    @Override
    public final void run() {
        osc g;
        Object putIfAbsent;
        String str;
        TLRPC.TL_wallPaper tL_wallPaper;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                ((WalletEngine2) this.b).lambda$signMessage$13((jac) this.d, (String) this.c, (String) this.e);
                return;
            case 1:
                ((WalletEngine2) this.b).lambda$decryptTransactionComment$48((String) this.c, (byte[]) this.e, (jac) this.d);
                return;
            case 2:
                ((WalletEngine2) this.b).lambda$prepareRotateKey$38((byte[]) this.d, (String) this.c, (nac) this.e);
                return;
            case 3:
                WalletEngine2.lambda$emulateSend$18((AtomicBoolean) this.b, (jac) this.d, (TL_wallet.walletTransaction) this.e, (String) this.c);
                return;
            case 4:
                zsc zscVar = (zsc) this.b;
                mi5 mi5Var = (mi5) this.d;
                ysc yscVar = (ysc) this.e;
                ConcurrentHashMap concurrentHashMap = btc.a;
                if ("fqv01SQemVIBAAAApND8LDRUhRU".equals((String) this.c)) {
                    g = btc.c();
                } else {
                    String a = mi5Var.a();
                    ConcurrentHashMap concurrentHashMap2 = btc.a;
                    Object obj = concurrentHashMap2.get(a);
                    if (obj == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(a, (obj = new Object()))) != null) {
                        obj = putIfAbsent;
                    }
                    synchronized (obj) {
                        g = btc.g(btc.b(mi5Var));
                    }
                }
                gm.c3(new xsc(zscVar, g, yscVar));
                return;
            case 5:
                zsc zscVar2 = (zsc) this.b;
                TLObject tLObject = (TLObject) this.d;
                ysc yscVar2 = (ysc) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                if ((tLObject instanceof TLRPC.TL_wallPaper) && (document = (tL_wallPaper = (TLRPC.TL_wallPaper) tLObject).document) != null) {
                    yscVar2.e = document;
                    yscVar2.f = tL_wallPaper;
                    zscVar2.c(yscVar2);
                    return;
                }
                if (tL_error != null) {
                    String str2 = yscVar2.b;
                    boolean isTestBackend = ConnectionsManager.getInstance(zscVar2.a).isTestBackend();
                    Context context = a.b;
                    if (isTestBackend) {
                        str = "wallpaper_patterns_test";
                    } else {
                        str = "wallpaper_patterns";
                    }
                    context.getSharedPreferences(str, 0).edit().putLong(b10.h("rejected_", str2), System.currentTimeMillis()).apply();
                }
                zscVar2.a(yscVar2, null);
                return;
            default:
                xvc xvcVar = (xvc) this.b;
                ((ArrayDeque) xvcVar.b).addLast(new wvc((wm2) this.d, (bw8) this.c, (RequestTimeDelegate) this.e));
                xvcVar.I();
                return;
        }
    }

    public tpc(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
        this.e = obj4;
    }

    public tpc(AtomicBoolean atomicBoolean, jac jacVar, TL_wallet.walletTransaction wallettransaction, String str) {
        this.a = (byte) 3;
        this.b = atomicBoolean;
        this.d = jacVar;
        this.e = wallettransaction;
        this.c = str;
    }

    public tpc(WalletEngine2 walletEngine2, String str, byte[] bArr, jac jacVar) {
        this.a = (byte) 1;
        this.b = walletEngine2;
        this.c = str;
        this.e = bArr;
        this.d = jacVar;
    }
}
