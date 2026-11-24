package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
public final class li5 extends AsyncTask {
    public final byte a = 1;
    public final HashMap b = new HashMap();
    public Exception c;
    public final qac d;

    public li5(qac qacVar) {
        this.d = qacVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        BufferedReader bufferedReader;
        byte b = this.a;
        HashMap hashMap = this.b;
        switch (b) {
            case 0:
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(((String[]) objArr)[0]).openConnection();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        if (entry.getKey() != null && entry.getValue() != null) {
                            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setDoInput(true);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode >= 200 && responseCode < 300) {
                        if (httpURLConnection.getContentType() != null && httpURLConnection.getContentType().contains("svg")) {
                            return neb.f(new BufferedInputStream(httpURLConnection.getInputStream()), 64, 64);
                        }
                        return BitmapFactory.decodeStream(new BufferedInputStream(httpURLConnection.getInputStream()));
                    }
                    httpURLConnection.disconnect();
                    return null;
                } catch (Exception e) {
                    this.c = e;
                    return null;
                }
            default:
                try {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(((String[]) objArr)[0]).openConnection();
                    for (Map.Entry entry2 : hashMap.entrySet()) {
                        if (entry2.getKey() != null && entry2.getValue() != null) {
                            httpURLConnection2.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                        }
                    }
                    httpURLConnection2.setRequestMethod("GET");
                    httpURLConnection2.setDoInput(true);
                    int responseCode2 = httpURLConnection2.getResponseCode();
                    if (responseCode2 >= 200 && responseCode2 < 300) {
                        bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection2.getInputStream()));
                    } else {
                        bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection2.getErrorStream()));
                    }
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            sb.append(readLine);
                        } else {
                            bufferedReader.close();
                            return sb.toString();
                        }
                    }
                } catch (Exception e2) {
                    this.c = e2;
                    return null;
                }
                break;
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        byte b = this.a;
        qac qacVar = this.d;
        switch (b) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                ts9 ts9Var = (ts9) qacVar;
                if (ts9Var != null) {
                    if (this.c == null) {
                        ts9Var.a(bitmap);
                        return;
                    } else {
                        ts9Var.a(null);
                        return;
                    }
                }
                return;
            default:
                String str = (String) obj;
                if (qacVar != null) {
                    if (this.c == null) {
                        qacVar.a(str);
                        return;
                    } else {
                        qacVar.a(null);
                        return;
                    }
                }
                return;
        }
    }

    public li5(ts9 ts9Var) {
        this.d = ts9Var;
    }
}
