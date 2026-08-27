package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

public final class a3 implements Runnable {

    public final int f19659a = 0;

    public final int f19660b;

    public final long f19661c;
    public final int d;

    public final BaseController f19662e;

    public final Object f19663f;
    public final Object h;

    public final Object f19664n;

    public final Object f19665r;

    public final Object f19666s;
    public final Object v;

    public final Object f19667w;

    public a3(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j10, int i10, int i11) {
        this.f19662e = fileLoader;
        this.f19663f = document;
        this.h = secureDocument;
        this.f19664n = webFile;
        this.f19665r = tL_fileLocationToBeDeprecated;
        this.f19666s = imageLocation;
        this.v = obj;
        this.f19667w = str;
        this.f19661c = j10;
        this.f19660b = i10;
        this.d = i11;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f19659a) {
            case 0:
                ((FileLoader) this.f19662e).lambda$loadFile$13((TLRPC.Document) this.f19663f, (SecureDocument) this.h, (WebFile) this.f19664n, (TLRPC.TL_fileLocationToBeDeprecated) this.f19665r, (ImageLocation) this.f19666s, this.v, (String) this.f19667w, this.f19661c, this.f19660b, this.d);
                break;
            default:
                ((MediaDataController) this.f19662e).lambda$processLoadedStickers$105(this.f19660b, (a0.h) this.f19663f, (HashMap) this.h, (ArrayList) this.f19664n, this.f19661c, this.d, (a0.h) this.f19665r, (HashMap) this.f19666s, (a0.h) this.v, (Runnable) this.f19667w);
                break;
        }
    }

    public a3(MediaDataController mediaDataController, int i10, a0.h hVar, HashMap map, ArrayList arrayList, long j10, int i11, a0.h hVar2, HashMap map2, a0.h hVar3, Runnable runnable) {
        this.f19662e = mediaDataController;
        this.f19660b = i10;
        this.f19663f = hVar;
        this.h = map;
        this.f19664n = arrayList;
        this.f19661c = j10;
        this.d = i11;
        this.f19665r = hVar2;
        this.f19666s = map2;
        this.v = hVar3;
        this.f19667w = runnable;
    }
}
