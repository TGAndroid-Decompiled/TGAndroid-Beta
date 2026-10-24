package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class d3 implements Runnable {
    public final int f18192a = 0;
    public final int f18193b;
    public final long f18194c;
    public final int d;
    public final BaseController e;
    public final Object f18195f;
    public final Object h;
    public final Object f18196n;
    public final Object f18197r;
    public final Object f18198s;
    public final Object v;
    public final Object f18199w;

    public d3(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j10, int i10, int i11) {
        this.e = fileLoader;
        this.f18195f = document;
        this.h = secureDocument;
        this.f18196n = webFile;
        this.f18197r = tL_fileLocationToBeDeprecated;
        this.f18198s = imageLocation;
        this.v = obj;
        this.f18199w = str;
        this.f18194c = j10;
        this.f18193b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18192a) {
            case 0:
                int i10 = this.f18193b;
                int i11 = this.d;
                ((FileLoader) this.e).lambda$loadFile$13((TLRPC.Document) this.f18195f, (SecureDocument) this.h, (WebFile) this.f18196n, (TLRPC.TL_fileLocationToBeDeprecated) this.f18197r, (ImageLocation) this.f18198s, this.v, (String) this.f18199w, this.f18194c, i10, i11);
                return;
            default:
                ((MediaDataController) this.e).lambda$processLoadedStickers$105(this.f18193b, (a0.h) this.f18195f, (HashMap) this.h, (ArrayList) this.f18196n, this.f18194c, this.d, (a0.h) this.f18197r, (HashMap) this.f18198s, (a0.h) this.v, (Runnable) this.f18199w);
                return;
        }
    }

    public d3(MediaDataController mediaDataController, int i10, a0.h hVar, HashMap hashMap, ArrayList arrayList, long j10, int i11, a0.h hVar2, HashMap hashMap2, a0.h hVar3, Runnable runnable) {
        this.e = mediaDataController;
        this.f18193b = i10;
        this.f18195f = hVar;
        this.h = hashMap;
        this.f18196n = arrayList;
        this.f18194c = j10;
        this.d = i11;
        this.f18197r = hVar2;
        this.f18198s = hashMap2;
        this.v = hVar3;
        this.f18199w = runnable;
    }
}
