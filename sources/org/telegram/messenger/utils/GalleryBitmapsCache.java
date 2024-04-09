package org.telegram.messenger.utils;

import android.graphics.Bitmap;
import android.util.LruCache;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.DispatchQueue;
public class GalleryBitmapsCache {
    private int allQueuesIndex;
    private final ArrayList<DispatchQueue> allQueues = new ArrayList<>();
    private final HashMap<String, Integer> bitmapsUseCounts = new HashMap<>();
    private final LruCache<String, Bitmap> bitmapsCache = new LruCache<String, Bitmap>(45) {
        @Override
        public void entryRemoved(boolean z, String str, Bitmap bitmap, Bitmap bitmap2) {
            if (bitmap.isRecycled() || GalleryBitmapsCache.this.bitmapsUseCounts.containsKey(str)) {
                return;
            }
            bitmap.recycle();
        }
    };

    public ArrayList<DispatchQueue> getAllQueues() {
        return this.allQueues;
    }

    public int getAllQueuesIndex() {
        return this.allQueuesIndex;
    }

    public void setAllQueuesIndex(int i) {
        this.allQueuesIndex = i;
    }

    public Bitmap getBitmap(String str) {
        if (str == null) {
            return null;
        }
        Bitmap bitmap = this.bitmapsCache.get(str);
        if (bitmap != null) {
            Integer num = this.bitmapsUseCounts.get(str);
            this.bitmapsUseCounts.put(str, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
        return bitmap;
    }

    public void releaseBitmap(String str) {
        Integer num;
        if (str == null || (num = this.bitmapsUseCounts.get(str)) == null) {
            return;
        }
        Integer valueOf = Integer.valueOf(num.intValue() - 1);
        if (valueOf.intValue() <= 0) {
            this.bitmapsUseCounts.remove(str);
        } else {
            this.bitmapsUseCounts.put(str, valueOf);
        }
    }

    public void putBitmap(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            return;
        }
        this.bitmapsCache.put(str, bitmap);
        Integer num = this.bitmapsUseCounts.get(str);
        if (num != null) {
            this.bitmapsUseCounts.put(str, Integer.valueOf(num.intValue() + 1));
        } else {
            this.bitmapsUseCounts.put(str, 1);
        }
    }

    public void cleanupQueues() {
        releaseAllBitmaps();
        for (int i = 0; i < this.allQueues.size(); i++) {
            this.allQueues.get(i).cleanupQueue();
            this.allQueues.get(i).recycle();
        }
        this.allQueues.clear();
    }

    private void releaseAllBitmaps() {
        this.bitmapsUseCounts.clear();
        this.bitmapsCache.evictAll();
    }
}
