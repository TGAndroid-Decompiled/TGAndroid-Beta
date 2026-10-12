package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class d3 implements Runnable {
    public final int f17363a = 0;
    public final int f17364b;
    public final long f17365c;
    public final int d;
    public final BaseController f17366e;
    public final Object f17367f;
    public final Object h;
    public final Object f17368n;
    public final Object f17369r;
    public final Object f17370s;
    public final Object v;
    public final Object f17371w;

    public d3(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j3, int i10, int i11) {
        this.f17366e = fileLoader;
        this.f17367f = document;
        this.h = secureDocument;
        this.f17368n = webFile;
        this.f17369r = tL_fileLocationToBeDeprecated;
        this.f17370s = imageLocation;
        this.v = obj;
        this.f17371w = str;
        this.f17365c = j3;
        this.f17364b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f17363a) {
            case 0:
                int i10 = this.f17364b;
                int i11 = this.d;
                ((FileLoader) this.f17366e).lambda$loadFile$13((TLRPC.Document) this.f17367f, (SecureDocument) this.h, (WebFile) this.f17368n, (TLRPC.TL_fileLocationToBeDeprecated) this.f17369r, (ImageLocation) this.f17370s, this.v, (String) this.f17371w, this.f17365c, i10, i11);
                return;
            default:
                ((MediaDataController) this.f17366e).lambda$processLoadedStickers$105(this.f17364b, (a0.i) this.f17367f, (HashMap) this.h, (ArrayList) this.f17368n, this.f17365c, this.d, (a0.i) this.f17369r, (HashMap) this.f17370s, (a0.i) this.v, (Runnable) this.f17371w);
                return;
        }
    }

    public d3(MediaDataController mediaDataController, int i10, a0.i iVar, HashMap hashMap, ArrayList arrayList, long j3, int i11, a0.i iVar2, HashMap hashMap2, a0.i iVar3, Runnable runnable) {
        this.f17366e = mediaDataController;
        this.f17364b = i10;
        this.f17367f = iVar;
        this.h = hashMap;
        this.f17368n = arrayList;
        this.f17365c = j3;
        this.d = i11;
        this.f17369r = iVar2;
        this.f17370s = hashMap2;
        this.v = iVar3;
        this.f17371w = runnable;
    }
}
