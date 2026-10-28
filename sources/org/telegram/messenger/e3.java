package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class e3 implements Runnable {
    public final int f19949a = 0;
    public final int f19950b;
    public final long f19951c;
    public final int d;
    public final BaseController e;
    public final Object f19952f;
    public final Object h;
    public final Object f19953n;
    public final Object f19954r;
    public final Object f19955s;
    public final Object v;
    public final Object f19956w;

    public e3(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j10, int i10, int i11) {
        this.e = fileLoader;
        this.f19952f = document;
        this.h = secureDocument;
        this.f19953n = webFile;
        this.f19954r = tL_fileLocationToBeDeprecated;
        this.f19955s = imageLocation;
        this.v = obj;
        this.f19956w = str;
        this.f19951c = j10;
        this.f19950b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f19949a) {
            case 0:
                int i10 = this.f19950b;
                int i11 = this.d;
                ((FileLoader) this.e).lambda$loadFile$13((TLRPC.Document) this.f19952f, (SecureDocument) this.h, (WebFile) this.f19953n, (TLRPC.TL_fileLocationToBeDeprecated) this.f19954r, (ImageLocation) this.f19955s, this.v, (String) this.f19956w, this.f19951c, i10, i11);
                return;
            default:
                ((MediaDataController) this.e).lambda$processLoadedStickers$105(this.f19950b, (a0.h) this.f19952f, (HashMap) this.h, (ArrayList) this.f19953n, this.f19951c, this.d, (a0.h) this.f19954r, (HashMap) this.f19955s, (a0.h) this.v, (Runnable) this.f19956w);
                return;
        }
    }

    public e3(MediaDataController mediaDataController, int i10, a0.h hVar, HashMap hashMap, ArrayList arrayList, long j10, int i11, a0.h hVar2, HashMap hashMap2, a0.h hVar3, Runnable runnable) {
        this.e = mediaDataController;
        this.f19950b = i10;
        this.f19952f = hVar;
        this.h = hashMap;
        this.f19953n = arrayList;
        this.f19951c = j10;
        this.d = i11;
        this.f19954r = hVar2;
        this.f19955s = hashMap2;
        this.v = hVar3;
        this.f19956w = runnable;
    }
}
