package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class e3 implements Runnable {
    public final int f19954a = 0;
    public final int f19955b;
    public final long f19956c;
    public final int d;
    public final BaseController e;
    public final Object f19957f;
    public final Object h;
    public final Object f19958n;
    public final Object f19959r;
    public final Object f19960s;
    public final Object v;
    public final Object f19961w;

    public e3(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j10, int i10, int i11) {
        this.e = fileLoader;
        this.f19957f = document;
        this.h = secureDocument;
        this.f19958n = webFile;
        this.f19959r = tL_fileLocationToBeDeprecated;
        this.f19960s = imageLocation;
        this.v = obj;
        this.f19961w = str;
        this.f19956c = j10;
        this.f19955b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f19954a) {
            case 0:
                int i10 = this.f19955b;
                int i11 = this.d;
                ((FileLoader) this.e).lambda$loadFile$13((TLRPC.Document) this.f19957f, (SecureDocument) this.h, (WebFile) this.f19958n, (TLRPC.TL_fileLocationToBeDeprecated) this.f19959r, (ImageLocation) this.f19960s, this.v, (String) this.f19961w, this.f19956c, i10, i11);
                return;
            default:
                ((MediaDataController) this.e).lambda$processLoadedStickers$105(this.f19955b, (a0.h) this.f19957f, (HashMap) this.h, (ArrayList) this.f19958n, this.f19956c, this.d, (a0.h) this.f19959r, (HashMap) this.f19960s, (a0.h) this.v, (Runnable) this.f19961w);
                return;
        }
    }

    public e3(MediaDataController mediaDataController, int i10, a0.h hVar, HashMap hashMap, ArrayList arrayList, long j10, int i11, a0.h hVar2, HashMap hashMap2, a0.h hVar3, Runnable runnable) {
        this.e = mediaDataController;
        this.f19955b = i10;
        this.f19957f = hVar;
        this.h = hashMap;
        this.f19958n = arrayList;
        this.f19956c = j10;
        this.d = i11;
        this.f19959r = hVar2;
        this.f19960s = hashMap2;
        this.v = hVar3;
        this.f19961w = runnable;
    }
}
