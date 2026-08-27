package m5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import h7.r8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class l extends z5.a {

    public static final j9.a f17806e;

    public final List f17807a;

    public final Bundle f17808b;

    public int f17809c;
    public static final String[] d = {"none", "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};
    public static final Parcelable.Creator<l> CREATOR = new w(11);

    static {
        j9.a aVar = new j9.a(13);
        aVar.L(4, "com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime");
        aVar.L(4, "com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate");
        aVar.L(4, "com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate");
        aVar.L(1, "com.google.android.gms.cast.metadata.TITLE", "title");
        aVar.L(1, "com.google.android.gms.cast.metadata.SUBTITLE", "subtitle");
        aVar.L(1, "com.google.android.gms.cast.metadata.ARTIST", "artist");
        aVar.L(1, "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist");
        aVar.L(1, "com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName");
        aVar.L(1, "com.google.android.gms.cast.metadata.COMPOSER", "composer");
        aVar.L(2, "com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber");
        aVar.L(2, "com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber");
        aVar.L(2, "com.google.android.gms.cast.metadata.SEASON_NUMBER", "season");
        aVar.L(2, "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode");
        aVar.L(1, "com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle");
        aVar.L(1, "com.google.android.gms.cast.metadata.STUDIO", "studio");
        aVar.L(2, "com.google.android.gms.cast.metadata.WIDTH", "width");
        aVar.L(2, "com.google.android.gms.cast.metadata.HEIGHT", "height");
        aVar.L(1, "com.google.android.gms.cast.metadata.LOCATION_NAME", "location");
        aVar.L(3, "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude");
        aVar.L(3, "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude");
        aVar.L(5, "com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration");
        aVar.L(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia");
        aVar.L(5, "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime");
        aVar.L(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer");
        aVar.L(2, "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId");
        aVar.L(1, "com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle");
        aVar.L(2, "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber");
        aVar.L(1, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle");
        f17806e = aVar;
    }

    public l(ArrayList arrayList, Bundle bundle, int i10) {
        this.f17807a = arrayList;
        this.f17808b = bundle;
        this.f17809c = i10;
    }

    public static void c(int i10, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("null and empty keys are not allowed");
        }
        Integer num = (Integer) ((HashMap) f17806e.f12863b).get(str);
        int iIntValue = num != null ? num.intValue() : 0;
        if (iIntValue != i10 && iIntValue != 0) {
            throw new IllegalArgumentException(i0.a.n("Value for ", str, " must be a ", d[i10]));
        }
    }

    public static boolean f(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !f((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    public final void b(String str, String str2) {
        c(1, str);
        this.f17808b.putString(str, str2);
    }

    public final JSONObject d() {
        ArrayList arrayList;
        int size;
        int i10;
        Bundle bundle;
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                jSONObject.put("metadataType", this.f17809c);
                while (true) {
                    bundle = this.f17808b;
                    if (i10 >= size) {
                        break;
                    }
                    Object obj = arrayList.get(i10);
                    i10++;
                    String str = (String) obj;
                    if (str != null && bundle.containsKey(str)) {
                        j9.a aVar = f17806e;
                        String str2 = (String) ((HashMap) aVar.f12864c).get(str);
                        if (str2 != null) {
                            Integer num = (Integer) ((HashMap) aVar.f12863b).get(str);
                            int iIntValue = num != null ? num.intValue() : 0;
                            if (iIntValue != 1) {
                                if (iIntValue == 2) {
                                    jSONObject.put(str2, bundle.getInt(str));
                                } else if (iIntValue == 3) {
                                    jSONObject.put(str2, bundle.getDouble(str));
                                } else if (iIntValue != 4) {
                                    if (iIntValue == 5) {
                                        long j10 = bundle.getLong(str);
                                        Pattern pattern = r5.a.f46766a;
                                        jSONObject.put(str2, j10 / 1000.0d);
                                    }
                                }
                            }
                            jSONObject.put(str2, bundle.getString(str));
                        }
                    }
                }
            } catch (JSONException unused) {
            }
            size = arrayList.size();
            i10 = 0;
            for (String str3 : bundle.keySet()) {
                if (!str3.startsWith("com.google.")) {
                    Object obj2 = bundle.get(str3);
                    if (obj2 instanceof String) {
                        jSONObject.put(str3, obj2);
                    } else if (obj2 instanceof Integer) {
                        jSONObject.put(str3, obj2);
                    } else if (obj2 instanceof Double) {
                        jSONObject.put(str3, obj2);
                    }
                }
            }
        } catch (JSONException unused2) {
        }
        JSONArray jSONArrayB = s5.a.b(this.f17807a);
        if (jSONArrayB.length() != 0) {
            try {
                jSONObject.put("images", jSONArrayB);
            } catch (JSONException unused3) {
            }
        }
        arrayList = new ArrayList();
        int i11 = this.f17809c;
        if (i11 == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i11 == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i11 == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i11 == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i11 == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i11 == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        return jSONObject;
    }

    public final void e(JSONObject jSONObject) {
        HashSet hashSet;
        Bundle bundle = this.f17808b;
        bundle.clear();
        List list = this.f17807a;
        list.clear();
        this.f17809c = 0;
        try {
            this.f17809c = jSONObject.getInt("metadataType");
        } catch (JSONException unused) {
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray != null) {
            s5.a.c(list, jSONArrayOptJSONArray);
        }
        ArrayList arrayList = new ArrayList();
        int i10 = this.f17809c;
        if (i10 == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i10 == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i10 == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i10 == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i10 == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i10 == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        HashSet hashSet2 = new HashSet(arrayList);
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next != null && !"metadataType".equals(next)) {
                    j9.a aVar = f17806e;
                    String str = (String) ((HashMap) aVar.d).get(next);
                    if (str == null) {
                        hashSet = hashSet2;
                        Object obj = jSONObject.get(next);
                        if (obj instanceof String) {
                            bundle.putString(next, (String) obj);
                        } else if (obj instanceof Integer) {
                            bundle.putInt(next, ((Integer) obj).intValue());
                        } else if (obj instanceof Double) {
                            bundle.putDouble(next, ((Double) obj).doubleValue());
                        }
                    } else if (hashSet2.contains(str)) {
                        try {
                            Object obj2 = jSONObject.get(next);
                            if (obj2 != null) {
                                Integer num = (Integer) ((HashMap) aVar.f12863b).get(str);
                                int iIntValue = num != null ? num.intValue() : 0;
                                if (iIntValue == 1) {
                                    hashSet = hashSet2;
                                    if (obj2 instanceof String) {
                                        bundle.putString(str, (String) obj2);
                                    }
                                } else if (iIntValue == 2) {
                                    hashSet = hashSet2;
                                    if (obj2 instanceof Integer) {
                                        bundle.putInt(str, ((Integer) obj2).intValue());
                                    }
                                } else if (iIntValue == 3) {
                                    hashSet = hashSet2;
                                    double dOptDouble = jSONObject.optDouble(next);
                                    if (!Double.isNaN(dOptDouble)) {
                                        bundle.putDouble(str, dOptDouble);
                                    }
                                } else if (iIntValue == 4) {
                                    hashSet = hashSet2;
                                    if (obj2 instanceof String) {
                                        String str2 = (String) obj2;
                                        if (s5.a.a(str2) != null) {
                                            bundle.putString(str, str2);
                                        }
                                    }
                                } else if (iIntValue == 5) {
                                    long jOptLong = jSONObject.optLong(next);
                                    Pattern pattern = r5.a.f46766a;
                                    hashSet = hashSet2;
                                    try {
                                        bundle.putLong(str, jOptLong * 1000);
                                    } catch (JSONException unused2) {
                                    }
                                }
                            }
                        } catch (JSONException unused3) {
                            hashSet = hashSet2;
                        }
                    }
                    hashSet2 = hashSet;
                }
            }
        } catch (JSONException unused4) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return f(this.f17808b, lVar.f17808b) && this.f17807a.equals(lVar.f17807a);
    }

    public final int hashCode() {
        int iHashCode = 17;
        Bundle bundle = this.f17808b;
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                Object obj = bundle.get(it.next());
                iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.f17807a.hashCode() + (iHashCode * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.p(parcel, 2, this.f17807a);
        r8.b(parcel, 3, this.f17808b);
        int i11 = this.f17809c;
        r8.s(parcel, 4, 4);
        parcel.writeInt(i11);
        r8.r(parcel, iQ);
    }

    public l(int i10) {
        this(new ArrayList(), new Bundle(), i10);
    }
}
