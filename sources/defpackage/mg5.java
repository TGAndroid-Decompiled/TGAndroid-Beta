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
public final class mg5 extends AsyncTask {
    public final byte a = 0;
    public final HashMap b = new HashMap();
    public Exception c;
    public final p8c d;

    public mg5(p8c p8cVar) {
        this.d = p8cVar;
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
                            return lcb.f(new BufferedInputStream(httpURLConnection.getInputStream()), 64, 64);
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
        p8c p8cVar = this.d;
        switch (b) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                nu9 nu9Var = (nu9) p8cVar;
                if (nu9Var != null) {
                    if (this.c == null) {
                        nu9Var.a(bitmap);
                        return;
                    } else {
                        nu9Var.a(null);
                        return;
                    }
                }
                return;
            default:
                String str = (String) obj;
                if (p8cVar != null) {
                    if (this.c == null) {
                        p8cVar.a(str);
                        return;
                    } else {
                        p8cVar.a(null);
                        return;
                    }
                }
                return;
        }
    }

    public mg5(nu9 nu9Var) {
        this.d = nu9Var;
    }
}
