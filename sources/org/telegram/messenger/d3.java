package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class d3 implements Runnable {
    public final int f17362a = 0;
    public final int f17363b;
    public final long f17364c;
    public final int d;
    public final BaseController f17365e;
    public final Object f17366f;
    public final Object h;
    public final Object f17367n;
    public final Object f17368r;
    public final Object f17369s;
    public final Object v;
    public final Object f17370w;

    public d3(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j3, int i10, int i11) {
        this.f17365e = fileLoader;
        this.f17366f = document;
        this.h = secureDocument;
        this.f17367n = webFile;
        this.f17368r = tL_fileLocationToBeDeprecated;
        this.f17369s = imageLocation;
        this.v = obj;
        this.f17370w = str;
        this.f17364c = j3;
        this.f17363b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f17362a) {
            case 0:
                int i10 = this.f17363b;
                int i11 = this.d;
                ((FileLoader) this.f17365e).lambda$loadFile$13((TLRPC.Document) this.f17366f, (SecureDocument) this.h, (WebFile) this.f17367n, (TLRPC.TL_fileLocationToBeDeprecated) this.f17368r, (ImageLocation) this.f17369s, this.v, (String) this.f17370w, this.f17364c, i10, i11);
                return;
            default:
                ((MediaDataController) this.f17365e).lambda$processLoadedStickers$105(this.f17363b, (a0.i) this.f17366f, (HashMap) this.h, (ArrayList) this.f17367n, this.f17364c, this.d, (a0.i) this.f17368r, (HashMap) this.f17369s, (a0.i) this.v, (Runnable) this.f17370w);
                return;
        }
    }

    public d3(MediaDataController mediaDataController, int i10, a0.i iVar, HashMap hashMap, ArrayList arrayList, long j3, int i11, a0.i iVar2, HashMap hashMap2, a0.i iVar3, Runnable runnable) {
        this.f17365e = mediaDataController;
        this.f17363b = i10;
        this.f17366f = iVar;
        this.h = hashMap;
        this.f17367n = arrayList;
        this.f17364c = j3;
        this.d = i11;
        this.f17368r = iVar2;
        this.f17369s = hashMap2;
        this.v = iVar3;
        this.f17370w = runnable;
    }
}
