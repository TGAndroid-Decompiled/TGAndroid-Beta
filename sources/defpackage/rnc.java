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
public final class rnc implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public rnc(xqc xqcVar, String str, ng5 ng5Var, wqc wqcVar) {
        this.a = (byte) 4;
        this.b = xqcVar;
        this.c = str;
        this.d = ng5Var;
        this.e = wqcVar;
    }

    @Override
    public final void run() {
        mqc g;
        Object putIfAbsent;
        String str;
        TLRPC.TL_wallPaper tL_wallPaper;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                ((WalletEngine2) this.b).lambda$signMessage$13((i8c) this.d, (String) this.c, (String) this.e);
                return;
            case 1:
                ((WalletEngine2) this.b).lambda$decryptTransactionComment$48((String) this.c, (byte[]) this.e, (i8c) this.d);
                return;
            case 2:
                ((WalletEngine2) this.b).lambda$prepareRotateKey$38((byte[]) this.d, (String) this.c, (m8c) this.e);
                return;
            case 3:
                WalletEngine2.lambda$emulateSend$18((AtomicBoolean) this.b, (i8c) this.d, (TL_wallet.walletTransaction) this.e, (String) this.c);
                return;
            case 4:
                xqc xqcVar = (xqc) this.b;
                ng5 ng5Var = (ng5) this.d;
                wqc wqcVar = (wqc) this.e;
                ConcurrentHashMap concurrentHashMap = zqc.a;
                if ("fqv01SQemVIBAAAApND8LDRUhRU".equals((String) this.c)) {
                    g = zqc.c();
                } else {
                    String a = ng5Var.a();
                    ConcurrentHashMap concurrentHashMap2 = zqc.a;
                    Object obj = concurrentHashMap2.get(a);
                    if (obj == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(a, (obj = new Object()))) != null) {
                        obj = putIfAbsent;
                    }
                    synchronized (obj) {
                        g = zqc.g(zqc.b(ng5Var));
                    }
                }
                gl.c3(new vqc(xqcVar, g, wqcVar));
                return;
            case 5:
                xqc xqcVar2 = (xqc) this.b;
                TLObject tLObject = (TLObject) this.d;
                wqc wqcVar2 = (wqc) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                if ((tLObject instanceof TLRPC.TL_wallPaper) && (document = (tL_wallPaper = (TLRPC.TL_wallPaper) tLObject).document) != null) {
                    wqcVar2.e = document;
                    wqcVar2.f = tL_wallPaper;
                    xqcVar2.c(wqcVar2);
                    return;
                }
                if (tL_error != null) {
                    String str2 = wqcVar2.b;
                    boolean isTestBackend = ConnectionsManager.getInstance(xqcVar2.a).isTestBackend();
                    Context context = a.b;
                    if (isTestBackend) {
                        str = "wallpaper_patterns_test";
                    } else {
                        str = "wallpaper_patterns";
                    }
                    context.getSharedPreferences(str, 0).edit().putLong(b00.h("rejected_", str2), System.currentTimeMillis()).apply();
                }
                xqcVar2.a(wqcVar2, null);
                return;
            default:
                wtc wtcVar = (wtc) this.b;
                ((ArrayDeque) wtcVar.a).addLast(new vtc((rh1) this.d, (au8) this.c, (RequestTimeDelegate) this.e));
                wtcVar.z();
                return;
        }
    }

    public rnc(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
        this.e = obj4;
    }

    public rnc(AtomicBoolean atomicBoolean, i8c i8cVar, TL_wallet.walletTransaction wallettransaction, String str) {
        this.a = (byte) 3;
        this.b = atomicBoolean;
        this.d = i8cVar;
        this.e = wallettransaction;
        this.c = str;
    }

    public rnc(WalletEngine2 walletEngine2, String str, byte[] bArr, i8c i8cVar) {
        this.a = (byte) 1;
        this.b = walletEngine2;
        this.c = str;
        this.e = bArr;
        this.d = i8cVar;
    }
}
