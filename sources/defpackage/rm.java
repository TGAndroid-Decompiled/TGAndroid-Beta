package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class rm {
    public HashMap a;
    public HashMap b;
    public HashSet c;
    public b1 d;
    public final int e;

    public rm(int i) {
        this.e = i;
    }

    public static boolean a() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            boolean z = e21.a;
            fc4.e("EmojiDocumentFetcher", new IllegalStateException("Wrong thread"));
            return false;
        }
        return true;
    }

    public final void b(long j, sm smVar) {
        TLRPC.Document document;
        if (j != 0) {
            synchronized (this) {
                HashMap hashMap = this.a;
                if (hashMap != null && (document = (TLRPC.Document) hashMap.get(Long.valueOf(j))) != null) {
                    if (smVar != null) {
                        smVar.a(document);
                    }
                } else if (a()) {
                    HashMap hashMap2 = this.b;
                    if (hashMap2 == null) {
                        hashMap2 = new HashMap();
                        this.b = hashMap2;
                    }
                    ArrayList arrayList = (ArrayList) hashMap2.get(Long.valueOf(j));
                    if (arrayList != null) {
                        arrayList.add(smVar);
                        return;
                    }
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(smVar);
                    this.b.put(Long.valueOf(j), arrayList2);
                    HashSet hashSet = this.c;
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        this.c = hashSet;
                    }
                    hashSet.add(Long.valueOf(j));
                    if (this.d != null) {
                        return;
                    }
                    b1 b1Var = new b1(this, (byte) 16);
                    this.d = b1Var;
                    gm.c3(b1Var);
                }
            }
        }
    }

    public final TLRPC.InputStickerSet c(long j) {
        synchronized (this) {
            HashMap hashMap = this.a;
            if (hashMap == null) {
                return null;
            }
            TLRPC.Document document = (TLRPC.Document) hashMap.get(Long.valueOf(j));
            if (document == null) {
                return null;
            }
            return k47.i1(document);
        }
    }

    public final void d(ArrayList arrayList) {
        ArrayList arrayList2;
        if (a()) {
            vm.w();
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) instanceof TLRPC.Document) {
                    TLRPC.Document document = (TLRPC.Document) arrayList.get(i);
                    e(document);
                    HashMap hashMap = this.b;
                    if (hashMap != null && (arrayList2 = (ArrayList) hashMap.remove(Long.valueOf(document.id))) != null) {
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            sm smVar = (sm) arrayList2.get(i2);
                            if (smVar != null) {
                                smVar.a(document);
                            }
                        }
                        arrayList2.clear();
                    }
                }
            }
        }
    }

    public final void e(TLRPC.Document document) {
        if (document == null) {
            return;
        }
        synchronized (this) {
            HashMap hashMap = this.a;
            if (hashMap == null) {
                hashMap = new HashMap();
                this.a = hashMap;
            }
            hashMap.put(Long.valueOf(document.id), document);
        }
    }

    public final void f(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        synchronized (this) {
            if (this.a == null) {
                this.a = new HashMap();
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                TLRPC.Document document = (TLRPC.Document) obj;
                this.a.put(Long.valueOf(document.id), document);
            }
        }
    }
}
