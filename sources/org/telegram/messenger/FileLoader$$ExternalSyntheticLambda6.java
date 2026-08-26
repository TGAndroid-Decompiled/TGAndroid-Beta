package org.telegram.messenger;

import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

public final class FileLoader$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId = 0;
    public final BaseController f$0;
    public final Object f$1;
    public final int f$10;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;
    public final Object f$6;
    public final Object f$7;
    public final long f$8;
    public final int f$9;

    public FileLoader$$ExternalSyntheticLambda6(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j, int i, int i2) {
        this.f$0 = fileLoader;
        this.f$1 = document;
        this.f$2 = secureDocument;
        this.f$3 = webFile;
        this.f$4 = tL_fileLocationToBeDeprecated;
        this.f$5 = imageLocation;
        this.f$6 = obj;
        this.f$7 = str;
        this.f$8 = j;
        this.f$9 = i;
        this.f$10 = i2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((FileLoader) this.f$0).lambda$loadFile$13((TLRPC.Document) this.f$1, (SecureDocument) this.f$2, (WebFile) this.f$3, (TLRPC.TL_fileLocationToBeDeprecated) this.f$4, (ImageLocation) this.f$5, this.f$6, (String) this.f$7, this.f$8, this.f$9, this.f$10);
                break;
            default:
                LongSparseArray longSparseArray = (LongSparseArray) this.f$6;
                ((MediaDataController) this.f$0).lambda$processLoadedStickers$105(this.f$9, (LongSparseArray) this.f$1, (HashMap) this.f$2, (ArrayList) this.f$3, this.f$8, this.f$10, (LongSparseArray) this.f$4, (HashMap) this.f$5, longSparseArray, (Runnable) this.f$7);
                break;
        }
    }

    public FileLoader$$ExternalSyntheticLambda6(MediaDataController mediaDataController, int i, LongSparseArray longSparseArray, HashMap map, ArrayList arrayList, long j, int i2, LongSparseArray longSparseArray2, HashMap map2, LongSparseArray longSparseArray3, Runnable runnable) {
        this.f$0 = mediaDataController;
        this.f$9 = i;
        this.f$1 = longSparseArray;
        this.f$2 = map;
        this.f$3 = arrayList;
        this.f$8 = j;
        this.f$10 = i2;
        this.f$4 = longSparseArray2;
        this.f$5 = map2;
        this.f$6 = longSparseArray3;
        this.f$7 = runnable;
    }
}
