package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class y2 implements Runnable {
    public final int f22191a = 0;
    public final int f22192b;
    public final long f22193c;
    public final int d;
    public final BaseController f22194e;
    public final Object f22195f;
    public final Object h;
    public final Object f22196n;
    public final Object f22197r;
    public final Object f22198s;
    public final Object v;
    public final Object f22199w;

    public y2(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j10, int i9, int i10) {
        this.f22194e = fileLoader;
        this.f22195f = document;
        this.h = secureDocument;
        this.f22196n = webFile;
        this.f22197r = tL_fileLocationToBeDeprecated;
        this.f22198s = imageLocation;
        this.v = obj;
        this.f22199w = str;
        this.f22193c = j10;
        this.f22192b = i9;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f22191a) {
            case 0:
                int i9 = this.f22192b;
                int i10 = this.d;
                ((FileLoader) this.f22194e).lambda$loadFile$13((TLRPC.Document) this.f22195f, (SecureDocument) this.h, (WebFile) this.f22196n, (TLRPC.TL_fileLocationToBeDeprecated) this.f22197r, (ImageLocation) this.f22198s, this.v, (String) this.f22199w, this.f22193c, i9, i10);
                return;
            default:
                ((MediaDataController) this.f22194e).lambda$processLoadedStickers$105(this.f22192b, (a0.h) this.f22195f, (HashMap) this.h, (ArrayList) this.f22196n, this.f22193c, this.d, (a0.h) this.f22197r, (HashMap) this.f22198s, (a0.h) this.v, (Runnable) this.f22199w);
                return;
        }
    }

    public y2(MediaDataController mediaDataController, int i9, a0.h hVar, HashMap hashMap, ArrayList arrayList, long j10, int i10, a0.h hVar2, HashMap hashMap2, a0.h hVar3, Runnable runnable) {
        this.f22194e = mediaDataController;
        this.f22192b = i9;
        this.f22195f = hVar;
        this.h = hashMap;
        this.f22196n = arrayList;
        this.f22193c = j10;
        this.d = i10;
        this.f22197r = hVar2;
        this.f22198s = hashMap2;
        this.v = hVar3;
        this.f22199w = runnable;
    }
}
