package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class c3 implements Runnable {
    public final int f18017a = 0;
    public final int f18018b;
    public final long f18019c;
    public final int d;
    public final BaseController e;
    public final Object f18020f;
    public final Object h;
    public final Object f18021n;
    public final Object f18022r;
    public final Object f18023s;
    public final Object v;
    public final Object f18024w;

    public c3(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j10, int i10, int i11) {
        this.e = fileLoader;
        this.f18020f = document;
        this.h = secureDocument;
        this.f18021n = webFile;
        this.f18022r = tL_fileLocationToBeDeprecated;
        this.f18023s = imageLocation;
        this.v = obj;
        this.f18024w = str;
        this.f18019c = j10;
        this.f18018b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18017a) {
            case 0:
                int i10 = this.f18018b;
                int i11 = this.d;
                ((FileLoader) this.e).lambda$loadFile$13((TLRPC.Document) this.f18020f, (SecureDocument) this.h, (WebFile) this.f18021n, (TLRPC.TL_fileLocationToBeDeprecated) this.f18022r, (ImageLocation) this.f18023s, this.v, (String) this.f18024w, this.f18019c, i10, i11);
                return;
            default:
                ((MediaDataController) this.e).lambda$processLoadedStickers$105(this.f18018b, (a0.h) this.f18020f, (HashMap) this.h, (ArrayList) this.f18021n, this.f18019c, this.d, (a0.h) this.f18022r, (HashMap) this.f18023s, (a0.h) this.v, (Runnable) this.f18024w);
                return;
        }
    }

    public c3(MediaDataController mediaDataController, int i10, a0.h hVar, HashMap hashMap, ArrayList arrayList, long j10, int i11, a0.h hVar2, HashMap hashMap2, a0.h hVar3, Runnable runnable) {
        this.e = mediaDataController;
        this.f18018b = i10;
        this.f18020f = hVar;
        this.h = hashMap;
        this.f18021n = arrayList;
        this.f18019c = j10;
        this.d = i11;
        this.f18022r = hVar2;
        this.f18023s = hashMap2;
        this.v = hVar3;
        this.f18024w = runnable;
    }
}
